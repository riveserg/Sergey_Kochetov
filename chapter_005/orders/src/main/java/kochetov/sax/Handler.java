package kochetov.sax;

import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import kochetov.model.Operation;
import kochetov.model.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Сергей on 22.04.2017.
 */
public class Handler extends DefaultHandler {

    private Map<Integer, Order> dataMap = new HashMap<>();
    private String book;
    private Operation operation;
    private float price;
    private int volume;
    private long timeStart;


    @Override
    public void startDocument() throws SAXException {
       this.timeStart = System.currentTimeMillis();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println(System.currentTimeMillis() - this.timeStart);
    }

    @Override
    public void startElement(String s, String s1, String element, Attributes attributes) throws SAXException {
        super.startElement(s, s1, element, attributes);

        if (element.equals("")) {

        }
    }

    @Override
    public void endElement(String s, String s1, String s2) throws SAXException {
        super.endElement(s, s1, s2);
    }

    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
        super.characters(chars, i, i1);
    }
}
