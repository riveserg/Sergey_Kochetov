package kochetov.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Сергей on 22.04.2017.
 */
public class DomParser {
    public static final String FILE_NAME = "D:\\Java_petor_arsentev\\xml\\orders.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        long start = System.currentTimeMillis();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document doc = documentBuilder.parse(new File(FILE_NAME));

        Element element = doc.getDocumentElement();
        String titleEl = element.getNodeName();
        NodeList nodeList = doc.getElementsByTagName("AddOrder");

        System.out.println(System.currentTimeMillis() - start);
        // 20 579 mls
        System.out.println(titleEl);
    }
}