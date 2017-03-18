package ru.job4j.loop;

/**
 * Factorial.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Factorial for the number n!.
     * @param n - number
     * @return result calculating
     */
    public int calc(int n) {
        return (n == 0 || n == 1) ? 1 : n * calc(n - 1);
    }
}
