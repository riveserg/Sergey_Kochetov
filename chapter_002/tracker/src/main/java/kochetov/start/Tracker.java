package kochetov.start;


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
    private int position = 0;
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
            this.items[position++] = item;
        return item;
    }

    /**
     * Method creates the array if it is null or expands the array when is full.
     */
    private void toExpandArray() {
        if (items == null) {
            this.items = new Item[ARRAY_LENGTH];
        } else if (this.items.length == position) {
            Item[] newItems = new Item[this.items.length + ARRAY_LENGTH];
            System.arraycopy(this.items, 0, newItems, 0, position);
            this.items = newItems;
        }
    }

    /**
     * Update item.
     * @param item - item
     */
    public void update(Item item) {
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(item.getId())) {
                this.items[i].setName(item.getName());
                this.items[i].setDesc(item.getDesc());
                break;
            }
        }
    }

    /**
     * Delete item.
     * @param item - item
     */
    public void delete(Item item) {
        for (int i = 0; i < position; i++) {
            if (item != null && this.items[i].getId().equals(item.getId())) {
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
        Item[] result = new Item[position];
                System.arraycopy(this.items, 0, result, 0, position);
        return result;
    }

    /**
     *  Returns Items whose name matches.
     * @param key - item name
     * @return result
     */
    public Item[] findByName(String key) {
        Item[] tmp = new Item[position + 1];
        int countFindName = 0;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getName().equals(key)) {
                tmp[countFindName++] = this.items[i];
            }
        }
        Item[] result = new Item[countFindName];
        System.arraycopy(tmp, 0, result, 0, countFindName);
        return result;
    }

    /**
     *  Find item by ID.
     * @param id - id
     * @return result
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; i++) {
            if (id != null && this.items[i].getId().equals(id)) {
               result = this.items[i];
               break;
            }
        }
        return result;
    }
}