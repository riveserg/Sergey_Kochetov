package kochetov;

import kochetov.model.Operation;
import kochetov.model.Order;

import java.io.*;

/**
 * Created by Сергей on 18.04.2017.
 */
public class ParsingFile {
    private File file;
    private OrderBook orderBook = new OrderBook();

    public ParsingFile() {
        this.file = new File("D:\\Java_petor_arsentev\\xml\\orders.xml");
        this.loadFileAndAddToOrders(this.file);
    }

    public OrderBook getOrderBook() {
        return this.orderBook;
    }

    public void loadFileAndAddToOrders(File file) {


        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

               // length = stream.available();
            String line = "";


           // byte[] data = new byte[length];
            //stream.read(data);
           // String[] line = new String(data).split("\n");

            //System.out.println(line.length);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void parse(final String[] line) {
        String book;
        Operation operation;
        float price;
        int volume;
        String id;
        if (line.length == 7) {
            book = line[1].replace("book=", "").replace("\"", "");
            if (line[2].replace("operation=", "").replace("\"", "").equals("BUY")) {
                operation = Operation.BUY;
            } else {
                operation = Operation.SELL;
            }
            price = Float.valueOf(line[3].replace("price=", "").replace("\"", ""));
            volume = Integer.valueOf(line[4].replace("volume=", "").replace("\"", ""));
            id = line[5].replace("orderId=", "").replace("\"", "");

            this.orderBook.addToOrders(id, new Order(book, operation, price, volume));
        }
    }

    public static void main(String[] args) {
        ParsingFile pf = new ParsingFile();
    }

}
