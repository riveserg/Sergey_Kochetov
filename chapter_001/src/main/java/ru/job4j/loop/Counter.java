package ru.job4j.loop;

/**
 * Calculate.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     *  Method calculates sum of even numbers
     *  in the range from start to finish.
     * @param start - start number
     * @param finish - finish number
     * @return result
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}
