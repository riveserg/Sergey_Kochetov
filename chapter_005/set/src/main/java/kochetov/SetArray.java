package kochetov;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * SetArray.
 * Created by Сергей on 08.04.2017.
 */
public class SetArray<E> implements SimpleSet<E> {
    /**
     * Array for SetArray
     */
    private Object[] setArray;
    /**
     * Size array.
     */
    private int countSet = 0;

    /**
     * Constructor.
     * @param size - size of the array.
     */
    public SetArray(int size) {
        this.setArray = new Object[size];
    }

    /**
     * Add element to the array.
     * @param e - element add
     */
    @Override
    public void add(E e) {
        boolean isNew = true;
        if (e != null) {
           for (int i = 0; i < this.countSet; i++) {
               if (e.equals(this.setArray[0])) {
                   isNew = false;
               }
           }
           if (isNew) {
               this.setArray[countSet++] = e;
           }
        }

    }

    /**
     * Return size to the array.
     * @return array size
     */
    @Override
    public int size() {
        return countSet;
    }

    /**
     * Remove element from the array.
     * @param e - element remove
     */
    @Override
    public void remove(E e) {
        if (e != null) {
            for (int i = 0; i < this.countSet; i++) {
                if (e.equals(this.setArray[i])) {
                    System.arraycopy(this.setArray, i + 1, this.setArray, i, this.countSet--);
                }
            }
        }

    }

    /**
     * Iterator.
     * @return new itr
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /**
             * index.
             */
            private int position = 0;

            /**
             * HasNext.
             * @return true if has next.
             */
            @Override
            public boolean hasNext() {
                return countSet != this.position;
            }

            /**
             * Next.
             * @return return next element in set.
             */
            @Override
            public E next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                return (E) setArray[position++];
            }
        };
    }
}
