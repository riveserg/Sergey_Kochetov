package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MaxTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    /**
     *  Method test. first number is greater than second.
     */
    @Test
    public void whenFirstGreaterSecondThenFirst() {
        Max max = new Max();
        int result = max.max(10, 5);
        int expected = 10;
        assertThat(result, is(expected));
    }
    /**
     *  Method test.  third number is greater.
     */
    @Test
    public void whenThirdNumberIsGreaterThenTrue() {
        Max max = new Max();
        int result = max.max(10, 5, 15);
        int expected = 15;
        assertThat(result, is(expected));
    }
}
