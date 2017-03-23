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
            this.toExpandArray();
            this.items[++position] = item;
        return item;
    }

    /**
     * Method creates the array if it is null or expands the array when is full.
     */
    private void toExpandArray() {
        if (items == null) {
            this.items = new Item[ARRAY_LENGTH];
        } else if (this.items.length == position + 1) {
            Item[] newItems = new Item[this.items.length + ARRAY_LENGTH];
            System.arraycopy(this.items, 0, newItems, 0, position + 1);
            this.items = newItems;
        }
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
                    //this.items[i] = null;
                    System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1);
                    position--;
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
        Item[] result = null;
        boolean isFind = false;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                result = new Item[i];
                System.arraycopy(this.items, 0, result, 0, i);
                isFind = true;
                break;
            }
        }
        if (!isFind) {
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

}
