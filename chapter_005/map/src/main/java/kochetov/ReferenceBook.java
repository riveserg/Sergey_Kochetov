package kochetov;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ReferenceBook.
 * Created by Сергей on 09.04.2017.
 */
public class ReferenceBook<K, V> implements SimpleMap<K, V> {
    /**
     * Arrays of elements.
     */
    private EntryBook[] books;
    /**
     *
     * position to books.
     */
    private int position;
    /**
     * Constructor.
     */
    public ReferenceBook() {
        this.books = new EntryBook[100];
    }

    /**
     * Return length array book.
     * @return length array
     */
    public int size() {
        return this.position;
    }

    /**
     * Add for books new key and value.
     * @param key key.
     * @param value value.
     * @return result
     */
    @Override
    public boolean insert(K key, V value) {

        boolean isInsert = true;
        if (key == null) {
            throw new IllegalArgumentException();
        }
        EntryBook<K, V> book = new EntryBook<>(key, value);

        for (int i = 0; i < position; i++) {
            if (this.books[i].getKey().equals(key)) {
                books[i] = book;
                isInsert = false;
                break;
            }
        }
        if (isInsert) {
            books[position++] = book;
        }


        return isInsert;
    }

    /**
     * Get value for books by key.
     * @param key key to search.
     * @return value
     */
    @Override
    public V get(K key) {
        for (int i = 0; i < position; i++) {
            if (this.books[i].getKey().equals(key)) {
               return (V) this.books[i].getValue();
            }
        }
        throw new IllegalArgumentException("Key not found");

    }

    /**
     *  Delete for books by key.
     * @param key - key of element to delete
     * @return result
     */
    @Override
    public boolean delete(K key) {
        boolean isDel = true;
        if (key == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < position; i++) {
            if (this.books[i].getKey().equals(key)) {
                System.arraycopy(this.books, i, this.books, i + 1, this.position--);
                isDel  = false;
            }
        }
        return isDel;
    }

    /**
     * My iterator.
     * @return my iterator.
     */
    @Override
    public Iterator iterator() {
        return new Iterator() {
            /**
             * index of array books.
             */
            private int index = 0;

            /**
             * hasNext().
             * @return result
             */
            @Override
            public boolean hasNext() {
                return this.index < position;
            }

            /**
             * next().
             * @return next element array.
             */
            @Override
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return books[index++];
            }
        };
    }

    /**
     * EntryBook.
     * @param <K> key
     * @param <V> value
     */
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
