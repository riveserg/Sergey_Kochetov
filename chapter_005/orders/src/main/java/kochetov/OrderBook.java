package kochetov;

import kochetov.model.Order;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Сергей on 18.04.2017.
 */
public class OrderBook {
    private Map<String, Order> orders;
    public OrderBook() {
        this.orders = new TreeMap<>();
    }
    public void addToOrders(String id, Order order){
        if (order != null) {
            this.orders.put(id, order);
        }
    }

    public void removeFromOrders(String id) {
        this.orders.remove(id);
    }

    public Map<String, Order> getOrders() {
        return this.orders;
    }
}
