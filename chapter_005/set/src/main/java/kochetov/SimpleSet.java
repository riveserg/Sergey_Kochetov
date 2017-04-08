package kochetov;

/**
 * SimpleSet.
 * Created by Сергей on 08.04.2017.
 */
public interface SimpleSet<E> extends Iterable<E> {
    /**
     * Method add element to set.
     * @param e - element add
     */
    void add(E e);

    /**
     * Method return set length.
     * @return length
     */
    int size();

    /**
     * Method remove element from set.
     * @param e - element remove
     */
    void remove(E e);
}
