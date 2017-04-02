package kochetov;

import java.util.Iterator;

/**
 * Created by Сергей on 02.04.2017.
 */
public class IteratorArray implements Iterator<Integer> {
    /**
     * Input array.
     */
    private final int[][] array;
    /**
     * array index width.
     */
    private int i = 0;
    /**
     * array index height.
     */
    private int j = 0;
    /**
     * Constructor.
     *
     * @param array input two-dimensional array.
     */
    public IteratorArray(final int[][] array) {
        this.array = array;
    }
    /**
     * Method hasNext().
     * @return true if array is not empty or false
     */
    @Override
    public boolean hasNext() {
        boolean result = true;
        if (this.j == this.array[i].length) {
            this.i++;
            this.j = 0;
        }
        if (this.i == this.array.length) {
            result = false;
        }
        return result;
    }
    /**
     * Method next().
     * @return next array element
     */
    @Override
    public Integer next() {
        hasNext();
        return this.array[i][j++];
    }
}
