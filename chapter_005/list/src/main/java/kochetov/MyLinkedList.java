package kochetov;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * MyLinkedList.
 * Created by Сергей on 07.04.2017.
 */
public class MyLinkedList<E> implements SimpleContainer<E> {
    /**
     * Size MyLinkedList.
     */
    int size = 0;
    /**
     * First object reference.
     */
    private MyNode<E> first;
    /**
     * Last object reference.
     */
    private MyNode<E> last;

    /**
     * Method add element to list.
     * @param e element to add.
     */
    @Override
    public void add(E e) {
       linkedLast(e);
    }
    /**
     * Method add element to end list.
     * @param e element to add.
     */
    private void linkedLast(E e) {
        final MyNode<E> l = this.last;
        final MyNode<E> newNode = new MyNode<>(l, e, null);
        this.last = newNode;
        if (l == null) {
            // if add first element
            this.first = newNode;
        } else {
            l.next = newNode;
        }
        this.size++;
    }

    /**
     * Return element by index.
     * @param index - index of element.
     * @return element
     */
    @Override
    public E get(int index) {
        this.checkElementIndex(index);
        return (E) this.findMyNodeByIndex(index).item;
    }

    /**
     * The index valid data?
     * @param index - index on MyLinkedList
     */
    private void checkPositionIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
    }
    /**
     * The index valid data?
     * @param index - index on MyLinkedList
     */
    private void checkElementIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Find element by index.
     * @param index - index
     * @return MyNode
     */
    private MyNode<E> findMyNodeByIndex(int index) {
        MyNode<E> result;
        if(index < (this.size / 2)) {
            result = this.first;
            for (int i = 0; i < index; i++) {
                result = result.next;
            }
        } else {
            result = this.last;
            for(int i = this.size - 1; i > index; i--) {
                result = result.prev;
            }
        }
        return result;
    }

    /**
     * Delete element by index.
     * @param index - index
     */
    public void remove(int index) {
        MyNode<E> nodeToDel = this.findMyNodeByIndex(index);
        if (nodeToDel.next != null) {
            nodeToDel.next.prev = nodeToDel.prev;
        }
        if (nodeToDel.prev != null) {
            nodeToDel.prev.next = nodeToDel.next;
        }
        this.size--;
    }

    /**
     * Return size MyLinkedList.
     * @return size
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * MyIterator for MyLinkedList.
     * @return iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /**
             * pointer.
             */
            private int pointer = 0;

            /**
             * The movement of the pointer possible?
             * @return result
             */
            @Override
            public boolean hasNext() {
                return this.pointer < size;
            }

            /**
             * Return next element with MyLinkedList.
             * @return element
             */
            @Override
            public E next() {
                try {
                    return get(pointer++);
                } catch (NullPointerException e) {
                    throw new NoSuchElementException();
                }
            }
        };
    }

    /**
     * MyNode.
     * @param <E> generic
     */
    private static class MyNode<E> {
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
         * Constructor
         * @param prev - previous item
         * @param element - element
         * @param next - next item
         */
        MyNode(MyNode<E> prev, E element, MyNode<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

}
