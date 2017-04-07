package kochetov;

/**
 * SimpleContainer.
 * Created by Сергей on 07.04.2017.
 */
public interface SimpleContainer<E> extends Iterable<E> {
    /**
     * Add new element to list.
     * @param e element to add.
     */
    void add(E e);
    /**
     * Method get element from list.
     * @param index index of element.
     * @return element of list.
     */
    E get(int index);
    /**
     * Method return size list.
     * @return size list.
     */
    int size();
}