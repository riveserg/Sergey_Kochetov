package kochetov;

import java.util.NoSuchElementException;

/**
 * class UserStore.
 * Created by Сергей on 06.04.2017.
 */
public class UserStore<T extends Base> implements Store<T> {
    /**
     * Size UserStore.
     */
    private int userStoreSize = 10;
    /**
     * Container.
     */
    private SimpleArray<T> stores = new SimpleArray<T>(userStoreSize);

    /**
     * Add value to container.
     * @param value - value
     */
    @Override
    public void add(T value) {
        this.stores.add(value);
    }

    /**
     * Update element of store by id.
     * @param id - id
     * @param value - value
     */
    @Override
    public void update(String id, T value) {
        this.stores.update(this.findById(id), value);

    }

    /**
     * Delete element by id.
     * @param id - id
     */
    @Override
    public void delete(String id) {
        this.stores.delete(this.findById(id));

    }

    /**
     * Find index of element by id.
     * @param id - id
     * @return index
     */
    private int findById(String id) {
        int result = -1;
        for (int i = 0; i < userStoreSize; i++) {
            if (this.stores.get(i) != null && this.stores.get(i).getId().equals(id)) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new NoSuchElementException("Not find element by id.");
        }
        return result;
    }
}
