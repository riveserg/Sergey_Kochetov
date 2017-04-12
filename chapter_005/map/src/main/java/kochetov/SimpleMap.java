package kochetov;

/**
 * SimpleMap.
 * Created by Сергей on 09.04.2017.
 */
public interface SimpleMap<K, V> extends Iterable {
    /**
     * Method adds new pair key value.
     * @param key key.
     * @param value value.
     * @return true if inserted, false otherwise.
     */
    boolean insert(K key, V value);
    /**
     * Get value by key.
     * @param key key to search.
     * @return value.
     */
    V get(K key);
    /**
     * Delete element from map.
     * @param key - key of element to delete
     * @return true if deleted
     */
    boolean delete(K key);
}
