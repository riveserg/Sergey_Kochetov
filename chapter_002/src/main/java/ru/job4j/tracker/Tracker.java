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
            this.items = new Item[1];
            this.items[0] = item;
        } else {
            Item[] tmpItem = new Item[this.items.length + 1];
            for (int i = 0; i < this.items.length; i++) {
                tmpItem[i] = this.items[i];
            }
            tmpItem[tmpItem.length - 1] = item;
            this.items = tmpItem;
        }
        return item;
    }

    /**
     * Update item.
     * @param item - item
     */
    public void update(Item item) {
        for (Item itemUpd : this.items) {
            if (itemUpd.getId().equals(item.getId())) {
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
        Item[] newItems;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(item.getId())) {
                if (i != this.items.length - 1) {
                    for (int j = i; j < this.items.length - 1; j++) {
                        this.items[j] = this.items[j + 1];
                    }
                }
                newItems = new Item[this.items.length - 1];
                System.arraycopy(this.items, 0, newItems, 0, this.items.length - 1);
                this.items = newItems;
                break;
            }
        }
    }

    /**
     *  Returns a copy of array items without null elements.
     * @return new array item
     */
    public Item[] findAll() {
        Item[] tmpItem = new Item[this.items.length];
        Item[] result = this.items;
        int countNull = 0;
        for (Item itm : this.items) {
            if (itm != null) {
                tmpItem[countNull++] = itm;
            }
        }
        if (countNull != this.items.length) {
            result = new Item[countNull];
            System.arraycopy(tmpItem, 0, result, 0, countNull);
            this.items = result;
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
            if (findItem.getName().equals(key)) {
                countFindName++;
            }
        }
        if (countFindName > 0) {
            result = new Item[countFindName];
            int tmpCount = 0;
            for (Item findItem : this.items) {
                if (findItem.getName().equals(key)) {
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
            if (findItem.getId().equals(id)) {
               result = findItem;
               break;
            }
        }
        return result;
    }
}
