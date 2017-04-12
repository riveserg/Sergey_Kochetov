package kochetov;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * SetLinkedArray.
 * Created by Сергей on 08.04.2017.
 */
public class SetLinkedArray<E> implements SimpleSet<E> {
    /**
     * Size SetLinkedArray.
     */
    int count = 0;
    /**
     * items.
     */
    private Object[] items;
    /**
     * First object reference.
     */
    private MyNode<E> first;
    /**
     * Last object reference.
     */
    private MyNode<E> last;

    /**
     * Constructor.
     */
    public SetLinkedArray() {
        this.items = new Object[10];
    }

    /**
     * Method add element to set.
     * @param e - element add
     */
    @Override
    public void add(E e) {
        boolean isNewElement = true;
        if (e != null) {
            for (int i = 0; i < this.count; i++) {
                MyNode node = (MyNode) this.items[i];
                if (node.item.equals(e)) {
                    isNewElement = false;
                }
            }
            if (isNewElement) {
                if (count == 0) {
                    this.items[count] = new MyNode<E>(null, e, null);

                    this.first = (MyNode<E>) this.items[count];
                    this.last = (MyNode<E>) this.items[count];
                    this.count++;
                } else {
                    this.items[count] = new MyNode<E>((MyNode<E>) this.items[count - 1], e, null);
                    MyNode node = (MyNode) this.items[count - 1];
                    node.next = (MyNode) this.items[count - 1];
                    this.last = (MyNode<E>) this.items[count];
                    this.count++;
                }
            }
        }

    }

    /**
     * Return size etLinkedArray.
     * @return size
     */
    @Override
    public int size() {
        return this.count;
    }

    /**
     * //TODO.
     * @param e - element remove
     */
    @Override
    public void remove(E e) {
        //TODO
    }
    /**
     * Iterator for SetLinkedArray.
     * @return iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /**
             * pointer.
             */
            private int pointer;
            /**
             * The movement of the pointer possible?
             * @return result
             */
            @Override
            public boolean hasNext() {
                return this.pointer != count;
            }
            /**
             * Return next element with SetLinkedArray.
             * @return element
             */
            @Override
            public E next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                MyNode node = (MyNode) items[pointer++];
                return (E) node.item;
            }
        };
    }

    /**
     * MyNode.
     * @param <E> generic
     */
    private class MyNode<E> {
        /**
         * Item.
         */
        E item;
        /**
         * link to next item.
         */
        MyNode<E> next;
        /**
         * link to previous item.
         */
        MyNode<E> prev;
        /**
         * Constructor.
         * @param prev - previous item
         * @param element - element
         * @param next - next item
         */
        public MyNode(MyNode<E> next, E item, MyNode<E> prev) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

        /**
         * Constructor.
         */
        public MyNode(){}
    }
}
