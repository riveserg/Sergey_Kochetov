package ru.job4j.array;
/**
 * BubbleSort.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    /**
     *  Method BubbleSort.
     * @param array - array not sorted
     * @return result sorted
     */
    public int[] sort(int[] array) {
        if (array.length > 1) {
            int tmpNumber;
            for (int j = 0; j < array.length; j++) {
                for (int i = 1; i < array.length - j; i++) {
                    if (array[i - 1] > array[i]) {
                        tmpNumber = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tmpNumber;
                    }
                }
            }
        }
        return array;
    }
}
