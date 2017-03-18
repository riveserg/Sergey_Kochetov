package ru.job4j.condition;

/**
 * Point.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     * Point coordinate x.
     */
    private int x;
    /**
     * Point coordinate y.
     */
    private int y;

    /**
     *  Constructor.
     * @param x - x
     * @param y - y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *  Getter.
     * @return x
     */
    public int getX() {
        return x;
    }
    /**
     *  Getter.
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     *  Method condition check y(x) = a * x + b.
     * @param a - element a
     * @param b - element b
     * @return - result
     */
    public boolean is(int a, int b) {
        return this.y == a * this.x + b;
    }

}
