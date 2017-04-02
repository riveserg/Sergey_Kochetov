package kochetov;

import java.util.Iterator;

/**
 * Created by Сергей on 02.04.2017.
 */
public class IteratorEvenNumbers implements Iterator<Integer> {
    /**
     * Input numbers.
     */
    private final int[] array;
    /**
     * array index.
     */
    private int index = 0;

    /**
     *  Constructor.
     * @param array - array.
     */
    public IteratorEvenNumbers(final int[] array) {
        this.array = array;
    }

    /**
     * Method returns that there is an even number in the array.
     * @return result
     */
    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = this.index; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result = true;
                this.index = i;
                break;
            }

        }
        return result;
    }

    /**
     * Method returns an even number.
     * @return even number
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new RuntimeException("Missing even number");
        }
        return array[this.index++];
    }
}
