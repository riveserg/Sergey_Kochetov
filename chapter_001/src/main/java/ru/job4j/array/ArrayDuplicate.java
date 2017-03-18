package ru.job4j.array;

import java.util.Arrays;

/**
 * ArrayDuplicate.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     *  Method sorting array of strings.
     * @param array - array
     * @return result array
     */
    public String[] remove(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (!array[i].equals("") && array[i].equals(array[j])) {
                    array[j] = "";
                    count++;
                }
            }
        }
        return Arrays.copyOf(sortArray(array), array.length - count);
    }

    /**
     *  Own method for sorting rows.
     * @param array - array
     * @return sorted array
     */
    private String[] sortArray(String[] array) {
        String tmpString;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i].equals("")) {
                    tmpString = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmpString;
                }
            }
        }
        return array;
    }
}