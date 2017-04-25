package kochetov;

import kochetov.model.Order;

import java.util.Map;
import java.util.TreeMap;

/**
 * OrderBook.
 * Created by Сергей on 18.04.2017.
 */
public class OrderBook {
    /**
     * Map.
     */
    private Map<Integer, Order> orders;

    /**
     * Constructor.
     */
    public OrderBook() {
        this.orders = new TreeMap<>();
    }

    /**
     * Add to map.
     * @param id - id
     * @param order - order
     */
    public void addToOrders(Integer id, Order order){
        if (order != null) {
            this.orders.put(id, order);
        }
    }

    /**
     * Delete from map.
     * @param id - id
     */
    public void removeFromOrders(Integer id) {
        this.orders.remove(id);
    }

    /**
     * Getter.
     * @return map
     */
    public Map<Integer, Order> getOrders() {
        return this.orders;
    }
}
