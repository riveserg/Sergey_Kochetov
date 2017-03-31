package kochetov.start;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
    private List<Item> items = new ArrayList<>();
    /**
     * Item ID.
     */
    private int id = 1;

    /**
     *  Getter items.
     * @return all items
     */
    public List<Item> getAll() {
        return items;
    }

    /**
     * Create the array if it is not.
     * Add to array new element.
     * @param item - item
     * @return added item
     */
    public Item add(Item item) {
            if (item != null) {
                item.setId(String.valueOf(id++));
                this.items.add(item);
            }
        return item;
    }
    /**
     * Update item.
     * @param item - item
     */
    public void update(Item item) {
        for (Item list : items) {
            if (list.getId().equals(item.getId())) {
                list.setName(item.getName());
                list.setDesc(item.getDesc());
                break;
            }
        }
    }

    /**
     * Delete item.
     * @param item - item
     */
    public void delete(Item item) {
        Iterator<Item> it = this.items.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(item.getId())) {
                it.remove();
                break;
            }
        }
    }

    /**
     *  Returns a copy of array items without null elements.
     * @return new array item
     */
    public List<Item> findAll() {
        for (ListIterator<Item> it = this.items.listIterator(); it.hasNext(); ) {
            Item item = it.next();
            if(item == null) {
                it.remove();
            }
        }

        return this.items;
    }

    /**
     *  Returns Items whose name matches.
     * @param key - item name
     * @return result
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getName().equals(key)) {
                result.add(item);
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
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
