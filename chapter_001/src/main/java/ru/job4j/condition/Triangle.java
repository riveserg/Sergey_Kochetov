package ru.job4j.condition;

/**
 * Triangle.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    /**
     * Triangle point a.
     */
    private Point a;
    /**
     * Triangle point b.
     */
    private Point b;
    /**
     * Triangle point c.
     */
    private Point c;

    /**
     * Constructor Triangle.
     * @param a - point a
     * @param b - point b
     * @param c - point c
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Area of ​​a triangle.
     * @return result
     */
    public double area() {
        double result = 0;
        if (a != null && b != null & c != null) {
            double ab = lineLength(a, b);
            double ac = lineLength(a, c);
            double bc = lineLength(b, c);
            if (ac > 0 && ab > 0 && bc > 0) {
                double p = (ab + ac + bc) / 2;
                result = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
            }
        }
        return result;
    }

    /**
     * Line length by two point.
     * @param a - point a
     * @param b - point b
     * @return - line length
     */
    public double lineLength(Point a, Point b) {
        return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX())
                + (a.getY() - b.getY()) * (a.getY() - b.getY()));
    }

}
