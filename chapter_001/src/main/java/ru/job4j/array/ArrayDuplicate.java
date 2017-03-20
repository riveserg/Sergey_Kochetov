package ru.job4j.array;

import java.util.Arrays;

/**
 * ArrayDuplicate.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
class ArrayDuplicate {
    /**
     *  Method sorting array of strings!.
     * @param array - array
     * @return result array
     */
    String[] remove(String[] array) {
        int count = 0;
        String tmp;
        boolean flag;
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 1 + i; j < array.length - count; j++) {
                if (flag && array[i].equals(array[j])) {
                    flag = false;
                    tmp = array[j];
                    array[j] = array[array.length - 1 - count];
                    array[array.length - 1 - count] = tmp;
                    count++;
                    i--;
                }
            }
        }
        return Arrays.copyOf(array, array.length - count);
    }
}