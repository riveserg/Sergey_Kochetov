package kochetov.sax;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by Сергей on 22.04.2017.
 */
public class SaxParser {
    public static final String FILE_NAME = "D:\\Java_petor_arsentev\\xml\\orders.xml";

    public void parse() {
        SAXParserFactory parser = SAXParserFactory.newInstance();
        Handler handler = new Handler();

        try {
            SAXParser saxParser = parser.newSAXParser();
            //saxParser.parse(new File(FILE_NAME), handler);
        } catch (ParserConfigurationException | org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
    }




}
