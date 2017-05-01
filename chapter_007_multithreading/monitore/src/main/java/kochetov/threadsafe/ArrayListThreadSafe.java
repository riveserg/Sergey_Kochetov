package kochetov.threadsafe;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ArrayListThreadSafe
 * Created by Сергей on 30.04.2017.
 */
public class ArrayListThreadSafe<E> implements Iterable<E> {
        /**
         * Count of element.
         */
        private int count;
        /**
         * Array of data.
         */
        private Object[] data;
        /**
         * Default capacity of array.
         */
        private final static int DEFAULT_CAPACITY = 10;

        /**
         * Constructor (default).
         */
        public ArrayListThreadSafe() {
            this.data = new Object[DEFAULT_CAPACITY];
            this.count = 0;
        }

        /**
         * Constructor.
         * @param initCapacity - capacity
         */
        public ArrayListThreadSafe(final int initCapacity) {
            this.data = new Object[initCapacity];
            this.count = 0;
        }

        /**
         * Return element by index.
         * @param index - index
         * @return element data
         */
        public synchronized E get(int index) {
            if (index >= 0 && index <= this.count) {
                return (E) this.data[index];
            } else {
                throw new RuntimeException("index not found");
            }
        }

        /**
         * Add new element to ArrayList.
         * @param e - element
         */
        public void add(E e) {
            this.ensureCapacity(this.count);
            this.data[this.count++] = e;
        }

        /**
         * Create new array, if old array is full.
         * @param count
         */
        private void ensureCapacity(final int count) {
            if (count >= this.data.length) {
                this.data = Arrays.copyOf(this.data, count * 2 + 1);
            }
        }

        /**
         * Return length of MyList.
         * @return length of list
         */
        public int length() {
            return this.count;
        }

        /**
         * MyIterator.
         * @return new Iterator.
         */
        @Override
        public Iterator<E> iterator() {
            return new Iterator<E>() {
                /**
                 * Pointer of iterator.
                 */
                private int pointer = 0;
                /**
                 * Checks array has next element.
                 * @return true if has element, or false
                 */
                @Override
                public boolean hasNext() {
                    return this.pointer <= count;
                }

                /**
                 * Return next element of array.
                 * @return next element
                 */
                @Override
                public E next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    return (E) get(pointer++);
                }
            };
        }
}
