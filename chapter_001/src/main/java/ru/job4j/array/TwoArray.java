package ru.job4j.array;

/**
 * ArrayDuplicate.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class TwoArray {
    /**
     *  Merging of two sorted arrays.
     * @param firstArr - first array
     * @param secondArr - second array
     * @return result array
     */
    public int[] mergeTwoArrays(int[] firstArr, int[] secondArr) {
        int[] result = null;
        if (firstArr != null & secondArr != null) {
            result = new int[firstArr.length + secondArr.length];
            int countFirst = 0;
            int countSecond = 0;
            for (int i = 0; i < firstArr.length + secondArr.length; i++) {
                if ((countFirst < firstArr.length) && (countSecond < secondArr.length)) {
                    if (firstArr[countFirst] < secondArr[countSecond]) {
                        result[i] = firstArr[countFirst++];
                    } else {
                        result[i] = secondArr[countSecond++];
                    }
                } else if (countFirst == firstArr.length) {
                    result[i] = secondArr[countSecond++];
                } else {
                    result[i] = firstArr[countFirst++];
                }
            }
        }
        return result;
    }


}


