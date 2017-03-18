package ru.job4j.condition;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PointTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
    /**
     *  Method test - equation is true.
     */
    @Test
    public void whenEquationIsTrueThenTrue() {
        Point point = new Point(2, 4);
        boolean result = point.is(1, 2);
        boolean expected = true;
        assertThat(result, is(expected));
    }
    /**
     *  Method test - equation is false.
     */
    @Test
    public void whenEquationIsFalseThenFalse() {
        Point point = new Point(2, 4);
        boolean result = point.is(2, 2);
        boolean expected = false;
        assertThat(result, is(expected));
    }


}
