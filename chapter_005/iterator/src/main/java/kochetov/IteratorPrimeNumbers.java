package kochetov;

import java.util.Iterator;

/**
 * Created by Сергей on 03.04.2017.
 */
public class IteratorPrimeNumbers implements Iterator<Integer> {
    /**
     * Input numbers.
     */
    private final int[] array;
    /**
     * array index.
     */
    private int index = 0;

    /**
     * Constructor.
     * @param array - array
     */
    public IteratorPrimeNumbers(final int[] array) {
        this.array = array;
    }
    /**
     * Method returns that there is an prime number in the array.
     * @return result
     */
    @Override
    public boolean hasNext() {
        for(int i = this.index; i < array.length; i++) {
            int arrNumberLength = 1;
            //arrNumberLength = String.valueOf(array[i]).length();

            for (int j = 2; j <= array[i]/arrNumberLength; j++) {
                if (array[i] % j == 0) {
                    if (array[i] == j) {
                        this.index = i;
                        return true;
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }
    /**
     * Method returns an prime number.
     * @return prime number
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new RuntimeException("Missing prime number");
        }
        return array[this.index++];
    }
}
