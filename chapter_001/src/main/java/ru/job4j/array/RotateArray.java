package ru.job4j.array;

/**
 * RotateArray.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class RotateArray {
    /**
     * Method rotate a two dimensional array clockwise.
     * @param array - start array
     * @return result rotate array
     */
    public int[][] rotate(int[][] array) {
        if (array[0].length != array.length) {
            return array;
        }
        int tmpNumber;
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array[i].length - 1 - i; j++) {
                tmpNumber = array[i][j];
                array[i][j] = array[array.length - 1 - j][i];
                array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
                array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
                array[j][array.length - 1 - i] = tmpNumber;
            }
        }
        return array;
    }
}
