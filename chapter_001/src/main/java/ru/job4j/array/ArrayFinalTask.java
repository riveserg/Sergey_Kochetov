package ru.job4j.array;

/**
 * ArrayDuplicate.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class ArrayFinalTask {
    /**
     *  Own method contains.
     * @param origin string
     * @param sub substring
     * @return result
     */
    public boolean contains(String origin, String sub) {
        boolean result = false;

        char[] originCharArr = origin.toCharArray();
        char[] subCharArr = sub.toCharArray();

        boolean flag;
        for (int i = 0; i < originCharArr.length; i++) {
            flag = true;
            if (originCharArr[i] == subCharArr[0] && (originCharArr.length - i) >= subCharArr.length) {
                for (int j = 1; j < subCharArr.length; j++) {
                    if (!(originCharArr[i + j] == subCharArr[j])) {
                        flag = false;
                    }
                }
                if (flag) {
                    result = true;
                }
            }
        }
        return result;
    }

}
