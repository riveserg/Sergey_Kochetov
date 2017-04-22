package kochetov.model;

/**
 * Order.
 * Created by Сергей on 18.04.2017.
 */
public class Order {
    private String book;
    private Operation operation;
    private float price;
    private int volume;

    public Order(String book, Operation operation, float price, int volume) {
        this.book = book;
        this.operation = operation;
        this.price = price;
        this.volume = volume;
    }

    public String getBook() {
        return book;
    }

    public Operation getOperation() {
        return operation;
    }

    public float getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (Float.compare(order.price, price) != 0) return false;
        if (volume != order.volume) return false;
        if (!book.equals(order.book)) return false;
        return operation == order.operation;
    }

    @Override
    public int hashCode() {
        int result = book.hashCode();
        result = 31 * result + operation.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + volume;
        return result;
    }
}
