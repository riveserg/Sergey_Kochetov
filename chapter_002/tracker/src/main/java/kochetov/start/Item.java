package kochetov.start;

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
     *  Date of create.
     */
    private long created;
    /**
     * Comments.
     */
    private String[] commentes;


    /**
     *  Constructor Item.
     * @param name - name
     * @param desc - description
     */
    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;

        this.created = System.currentTimeMillis();
    }

    /**
     * Constructor Item.
     * @param id - id
     */
    public Item(String id) {
        this.name = "null";
        this.desc = "null";
        this.id = id;
        this.created = System.currentTimeMillis();
    }

    /**
     * Constructor Item.
     * @param name - name
     * @param desc - description
     * @param id - id
     */
    public Item(String name, String desc, String id) {
        this.name = name;
        this.desc = desc;
        this.id = id;
        this.created = System.currentTimeMillis();
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
     * Setter id.
     * @param id - id
     */
    public void setId(String id) {
        this.id = id;
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

    /**
     *  Equals.
     * @param o - item.
     * @return result
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Item item = (Item) o;

        if (!name.equals(item.name)) {
            return false;
        }
        if (!desc.equals(item.desc)) {
            return false;
        }
        return id.equals(item.id);
    }

    /**
     * HashCode.
     * @return result
     */
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + desc.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}
