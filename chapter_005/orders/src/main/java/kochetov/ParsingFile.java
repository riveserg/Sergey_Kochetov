package kochetov;

import kochetov.model.Operation;
import kochetov.model.Order;

import java.io.*;

/**
 * ParsingFile.
 * Created by Сергей on 18.04.2017.
 */
public class ParsingFile {
    /**
     * File by parsing.
     */
    private File file;
    /**
     * OrderBook class wrapper for the map.
     */
    private OrderBook orderBook = new OrderBook();

    /**
     * Constructor.
     */
    public ParsingFile() {
        this.file = new File("D:\\Java_petor_arsentev\\xml\\orders.xml");
        this.loadFileAndAddToOrders(this.file);
    }

    /**
     * Getter.
     * @return
     */
    public OrderBook getOrderBook() {
        return this.orderBook;
    }

    /**
     * Method reads the file and add load data to OrderBook.
     * @param file - file for parsing.
     */
    public void loadFileAndAddToOrders(File file) {


        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            System.out.println("Start parsing...");
            long start = System.currentTimeMillis();

            while (line != null) {
                if (line.startsWith("<A")) {
                 this.parseToAdd(line);
                } else if (line.startsWith("<D")) {
                 this.parseToDel(line);
                }
                line = reader.readLine();
            }
            System.out.println(String.format("parsing for %d ms", System.currentTimeMillis() - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method parsing and add to OrderBook.
     * @param line - string line
     */
    public void parseToAdd(final String line) {
        String [] str = line.split("\"");
        String book = str[1];
        Operation operation;
        if (str[3].equals("BUY")) {
            operation = Operation.BUY;
        } else {
            operation = Operation.SELL;
        }
        float price = Float.valueOf(str[5]);
        int volume = Integer.valueOf(str[7]);
        int id = Integer.valueOf(str[9]);
        this.orderBook.addToOrders(id, new Order(book, operation, price, volume));
    }

    /**
     * Method parsing and delete from OrderBook.
     * @param line
     */
    public void parseToDel(final String line) {
        String [] str = line.split("\"");
        int id = Integer.valueOf(str[3]);
        this.orderBook.removeFromOrders(id);
    }

    /**
     * Method print result for test.
     */
    public void print() {
        this.orderBook.getOrders().forEach((k, v) -> {
            System.out.println("k=" + k + ", v= " + v);
        });
    }

}
