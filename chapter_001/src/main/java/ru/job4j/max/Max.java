package ru.job4j.max;

/**
 * Max.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Method return maximum of 2 numbers.
     * @param first - first number
     * @param second - second number
     * @return - maximum number
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Method return maximum of 3 numbers.
     * @param first - first number
     * @param second - second number
     * @param third - third number
     * @return  - maximum number
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}
