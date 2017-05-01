package kochetov.threadsafe;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * LinkedListThreadSafe.
 * Created by Сергей on 01.05.2017.
 */
public class LinkedListThreadSafe<E> implements Iterable<E> {
    /**
     * List of size.
     */
    private int size;
    /**
     * First entry in list.
     */
    private MyEntry<E> first;
    /**
     * Last entry in list.
     */
    private MyEntry<E> last;

    public LinkedListThreadSafe() {
        this.size =0;
    }

    public synchronized void add(E e) {
        if (this.size == 0) {
            this.first = new MyEntry<>(null, e , null);
        } else {
            MyEntry<E> newEntry = new MyEntry<E>(this.last, e , null);
            this.last = newEntry;
        }
        this.size++;
    }

    /**
     * MyIterator.
     * @return new Iterator for LinkedList
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /**
             * Pointer of element.
             */
            private int pointer = 0;
            /**
             * Current Entry.
             */
            private MyEntry<E> currentEntry = first;

            /**
             * Check if list has next elem.
             * @return true if has next elem, or false
             */
            @Override
            public boolean hasNext() {
                return this.pointer != size;
            }

            /**
             * Return next element in LinkedList.
             * @return next element
             */
            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E result = currentEntry.elem;
                this.currentEntry = this.currentEntry.next;
                pointer++;
                return result;
            }
        };
    }



    /**
     * Private class for creating Double-linked entries in LinkedListThreadSafe.
     * @param <E> -  parametrized type
     */
    private class MyEntry<E> {
        /**
         * Element.
         */
        private E elem;
        /**
         * Next reference.
         */
        private MyEntry<E> next;
        /**
         * Previous reference.
         */
        private MyEntry<E> previous;

        /**
         * Constructor.
         * @param next - next reference
         * @param elem - element
         * @param previous - previous reference
         */
        MyEntry(MyEntry<E> next, E elem, MyEntry<E> previous) {
            this.next = next;
            this.elem = elem;
            this.previous = previous;
        }

    }
}
