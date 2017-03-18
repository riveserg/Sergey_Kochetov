package ru.job4j.array;
/**
 * Turn.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    /**
     *  Method invert array.
     * @param array - array
     * @return result invert
     */
    public int[] back(int[] array) {
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }



}
