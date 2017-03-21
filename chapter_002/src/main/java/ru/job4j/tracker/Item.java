package ru.job4j.tracker;

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
     * @param id - id
     */
    public Item(String name, String desc, String id) {
        this.name = name;
        this.desc = desc;
        this.id = id;
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
            result = "null";
        } else {
            result = "Item{" + "name='" + name + '\'' + ", desc='" + desc + '\'' + ", id='" + id + '\'' + '}';
        }
        return result;
    }
}
