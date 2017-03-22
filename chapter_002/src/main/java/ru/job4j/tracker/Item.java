package ru.job4j.tracker;

import java.util.Random;

/**
 * Item.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Item {
    /**
     * Name item.
     */
    private String name;
    /**
     * Description.
     */
    private String desc;
    /**
     * ID.
     */
    private String id;


    /**
     *  Constructor Item.
     * @param name - name
     * @param desc - description
     */
    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.id = String.valueOf(System.currentTimeMillis() + new Random().nextInt());
    }

    /**
     * Constructor Item null.
     */
    public Item() {
    }

    /**
     *  Getter.
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     *  Getter.
     * @return id
     */
    public String getId() {
        return id;
    }
    /**
     *  Getter.
     * @return description
     */
    public String getDesc() {
        return desc;
    }

    /**
     *  Setter.
     * @param name - name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *  Setter.
     * @param desc - description
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     *  Item to string.
     * @return result
     */
    @Override
    public String toString() {
        String result;
        if (this.name == null & this.id == null & this.desc == null) {
            result = String.format("Item{'%s'}", "null");
        } else {
            result = String.format("Item{name='%s', desc='%s'}", this.name, this.desc);
        }
        return result;
    }
}
