package kochetov;

import kochetov.model.Operation;
import kochetov.model.Order;

import java.util.*;



/**
 * Created by Сергей on 18.04.2017.
 */
public class ExecuteOrder {
    private Map<Float, Integer> bidOrders = new TreeMap<>();
    private Map<Float, Integer> askOrders = new TreeMap<>();

    private Map<String, Order> orders;
/*
    public ExecuteOrder() {
        this.orders = new ParsingFile().getOrderBook().getOrders();
    }*/

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

    public void  execute() {

    }
    public void print() {
        this.askOrders.forEach((k, v) -> {
            System.out.println("price = " + k + " volume= " + v);
        });
    }


    public static void main(String[] args) {
        ExecuteOrder ex = new ExecuteOrder();
        ex.addOrdersToTwoMap();
        ex.print();
    }
}
