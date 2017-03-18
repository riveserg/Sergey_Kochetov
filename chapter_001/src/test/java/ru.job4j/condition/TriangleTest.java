package ru.job4j.condition;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * TriangleTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    /**
     *  Method test - equation is true.
     */
    @Test
    public void whenAreaTriangleIsTrueThenTrue() {
        Triangle triangle = new Triangle(new Point(1, 1),
                new Point(-2, 4), new Point(-2, -2));
        double result = triangle.area();
        double except = 9.0;
        assertThat(result, closeTo(except,  0.01));
    }


}
