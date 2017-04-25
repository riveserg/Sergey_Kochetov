package kochetov;

import kochetov.model.Operation;
import kochetov.model.Order;

import java.util.*;



/**
 * ExecuteOrder.
 * Created by Сергей on 18.04.2017.
 */
public class ExecuteOrder {
    /**
     * Map bid.
     */
    private Map<Float, Integer> bidOrders;
    /**
     * Map ask.
     */
    private Map<Float, Integer> askOrders;
    /**
     * Parsing map.
     */
    private Map<Integer, Order> orders = new ParsingFile().getOrderBook().getOrders();

    /**
     * Constructor.
     */
    public ExecuteOrder() {
        this.bidOrders = new HashMap<>();
        this.askOrders = new HashMap<>();
    }

    /**
     * Fill two map (bid, ask)
     */
    public void addOrdersToTwoMap() {
        this.orders.forEach((k, v) -> {
            if (v.getOperation() == Operation.BUY) {
                if (this.askOrders.containsKey(v.getPrice())) {
                    this.askOrders.put(v.getPrice(), v.getVolume() + this.askOrders.get(v.getPrice()));
                } else {
                    this.askOrders.put(v.getPrice(), v.getVolume());
                }
            } else {
                if (this.bidOrders.containsKey(v.getPrice())) {
                    this.bidOrders.put(v.getPrice(), v.getVolume() + this.bidOrders.get(v.getPrice()));
                } else {
                    this.bidOrders.put(v.getPrice(), v.getVolume());
                }
            }
        });
    }

    /**
     * Main method.
     */
    public void  execute() {
        this.addOrdersToTwoMap();

        Map<Float, Integer> bidResult = new TreeMap<>();
        Map<Float, Integer> askResult = new TreeMap<>();

        this.bidOrders.forEach((k, v) -> {
           if (this.askOrders.containsKey(k)) {
               int volumeAsk = this.askOrders.get(k);
               if ( volumeAsk > v) {
                   this.bidOrders.put(k, 0);
                   this.askOrders.put(k, volumeAsk - v);
               } else if (volumeAsk < v){
                   this.bidOrders.put(k, v - volumeAsk);
                   this.askOrders.put(k, 0);

               } else {
                   this.bidOrders.put(k, 0);
                   this.askOrders.put(k, 0);
               }
           }
        });

        this.bidOrders.forEach((k, v) -> {
            if (v != 0) {
                bidResult.put(k, v);
            }
        });

        this.askOrders.forEach((k, v) -> {
            if (v != 0) {
               askResult.put(k, v);
            }
        });
        this.bidOrders = bidResult;
        this.askOrders = askResult;
    }

    /**
     * Method print for test.
     */
    public void print() {
        System.out.println("----BUY-----");
        this.askOrders.forEach((k, v) -> {
            System.out.println(" " + k + " " + v);
        });
        System.out.println("-----SELL----");
        this.bidOrders.forEach((k, v) -> {
            System.out.println("\t\t\t" + k + " " + v);
        });
    }

    /**
     * Main.
     * @param args - args
     */
   public static void main(String[] args) {
       long start = System.currentTimeMillis();
        ExecuteOrder ex = new ExecuteOrder();
        ex.execute();
        ex.print();
       System.out.println(System.currentTimeMillis() - start + "ms");
    }
}
