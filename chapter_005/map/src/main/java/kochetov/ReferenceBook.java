package kochetov;

import java.util.Iterator;

/**
 * Created by Сергей on 09.04.2017.
 */
public class ReferenceBook<K, V> implements SimpleMap<K, V> {
    /**
     * Arrays of elements.
     */
    private EntryBook[] books;

    public ReferenceBook() {
        this.books = new EntryBook[20];
    }

    @Override
    public boolean insert(K key, V value) {
        return false;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public boolean delete(K key) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private class EntryBook<K, V> {
        /**
         * key of entry book.
         */
        private K key;
        /**
         * value of entry book.
         */
        private V value;

        /**
         * Constructor
         * @param key - key
         * @param value - value
         */
        public EntryBook(K key, V value) {
            this.key = key;
            this.value = value;
        }

        /**
         * Getter.
         * @return key
         */
        public K getKey() {
            return key;
        }

        /**
         * Getter.
         * @return value
         */
        public V getValue() {
            return value;
        }

        /**
         *  toString for Test.
         * @return tag
         */
        @Override
        public String toString() {
            return String.format("key=%s value=%s", this.key, this.value);
        }
    }
}
