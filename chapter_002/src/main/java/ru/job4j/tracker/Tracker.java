package ru.job4j.tracker;

/**
 * Tracker.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     *  items.
     */
    private Item[] items;
    /**
     * Position array items.
     */
    private int position = -1;
    /**
     *  Default array ?.
     */
    private static final int ARRAY_LENGTH = 16;

    /**
     *  Getter items.
     * @return all items
     */
    public Item[] getAll() {
        return items;
    }

    /**
     * Create the array if it is not.
     * Add to array new element.
     * @param item - item
     * @return added item
     */
    public Item add(Item item) {
        if (items == null) {
            this.items = new Item[ARRAY_LENGTH];

        } else if (this.items.length == position + 1) {
            Item[] newItems = new Item[this.items.length + ARRAY_LENGTH];
            for (int i = 0; i < this.items.length; i++) {
                newItems[i] = this.items[i];
            }
            //System.arraycopy(newItems, 0, items, 0, position);
            this.items = newItems;
            System.out.println(this.items.length);

        }
            this.items[++position] = item;
        return item;
    }

    /**
     * Update item.
     * @param item - item
     */
    public void update(Item item) {
        for (Item itemUpd : this.items) {
            if (itemUpd != null && itemUpd.getId().equals(item.getId())) {
                itemUpd.setName(item.getName());
                itemUpd.setDesc(item.getDesc());
                break;
            }
        }
    }

    /**
     * Delete item.
     * @param item - item
     */
    public void delete(Item item) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(item.getId())) {
                if (i != this.items.length - 1) {
                    for (int j = i; j != this.items.length - 1; j++) {
                        this.items[j] = this.items[j + 1];
                    }
                } else {
                    this.items[position--] = null;
                }
                break;
            }
        }
    }

    /**
     *  Returns a copy of array items without null elements.
     * @return new array item
     */
    public Item[] findAll() {
        Item[] result;
        int countNull = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                countNull++;
            }
        }
        if (this.items.length - countNull > 0) {
            result = new Item[this.items.length - countNull];
            for (int i = 0; i != items.length - countNull; i++) {
                if (this.items[i] != null) {
                    result[i] = this.items[i];
                }
            }
        } else {
            result = this.items;
        }
        return result;
    }

    /**
     *  Returns Items whose name matches.
     * @param key - item name
     * @return result
     */
    public Item[] findByName(String key) {
        Item[] result = null;
        int countFindName = 0;
        for (Item findItem : this.items) {
            if (findItem != null && findItem.getName().equals(key)) {
                countFindName++;
            }
        }
        if (countFindName > 0) {
            result = new Item[countFindName];
            int tmpCount = 0;
            for (Item findItem : this.items) {
                if (findItem != null && findItem.getName().equals(key)) {
                    result[tmpCount++] = findItem;
                }
            }
        }
        return result;
    }

    /**
     *  Find item by ID.
     * @param id - id
     * @return result
     */
    public Item findById(String id) {
        Item result = null;
        for (Item findItem : this.items) {
            if (findItem != null && findItem.getId().equals(id)) {
               result = findItem;
               break;
            }
        }
        return result;
    }
    /*
    public static void main(String[] args) {
        Tracker  tr = new Tracker();
        tr.add(new Item("name1", "desc1"));
        tr.add(new Item("name2", "desc2"));
        tr.add(new Item("name3", "desc3"));
        tr.add(new Item("name4", "desc4"));
        tr.add(new Item("name5", "desc5"));
        tr.add(new Item("name6", "desc6"));
        tr.add(new Item("name7", "desc7"));
        tr.add(new Item("name8", "desc8"));
        tr.add(new Item("name1", "desc1"));
        tr.add(new Item("name2", "desc2"));
        tr.add(new Item("name3", "desc3"));
        tr.add(new Item("name4", "desc4"));
        tr.add(new Item("name5", "desc5"));
        tr.add(new Item("name6", "desc6"));
        tr.add(new Item("name7", "desc7"));
        tr.add(new Item("name8", "desc8"));



        for (Item item : tr.findAll()) {
            System.out.println(item.toString());
        }

    }*/
}
