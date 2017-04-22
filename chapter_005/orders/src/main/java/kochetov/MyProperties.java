package kochetov;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * MyProperties.
 * Created by Сергей on 19.04.2017.
 */
public class MyProperties {
    private Properties prop;

    public MyProperties(Properties prop) {
        this.prop = prop;
    }
    public void load(final InputStream inputStream) {
        try {
            this.prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getValue(final String key) {
        return this.prop.getProperty(key);
    }
}
