package kochetov;


import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * MyArrayList.
 * Created by Сергей on 07.04.2017.
 */
public class MyArrayList<E> implements SimpleContainer<E>{
    /**
     * Default capacity of array.
     */
    private static final int DEFAULT_SIZE = 20;
    /**
     * The size of the MyArrayList.
     */
    private int countList = 0;
    /**
     * MyArrayList elements.
     */
    private Object[] arrayListData;

    /**
     * Constructor.
     */
    public MyArrayList() {
        this.arrayListData = new Object[DEFAULT_SIZE];

    }

    /**
     * Method get element from MyArrayList.
     * @param index - index of element.
     * @return element
     */
    @Override
    public E get(int index) {
        if (index >= 0 && index < countList) {
            return (E) this.arrayListData[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    /**
     * Method return size MyArrayList.
     * @return size
     */
    @Override
    public int size() {
        return this.countList;
    }
    /**
     * Method add new element to MyArrayList.
     * @param e - element
     */
    public void add(E e) {
        this.checkCapacity(this.countList);
        this.arrayListData[this.countList++] = e;
    }

    private void checkCapacity(int value) {
        if (this.countList >= this.arrayListData.length) {
            this.arrayListData = Arrays.copyOf(this.arrayListData, value * 2);
        }
    }

    /**
     * Iterator for MyArrayList.
     * @return MyIterator
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /**
             * Pointer.
             */
            private int pointer = 0;

            /**
             * Method checks array has next element.
             * @return result
             */
            @Override
            public boolean hasNext() {
                return this.pointer < countList;
            }

            /**
             * Method return next element of array.
             * @return next element
             */
            @Override
            public E next() {
                try {
                    return get(this.pointer++);
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
