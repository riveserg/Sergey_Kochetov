package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FactorialTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class FactorialTest {
    /**
     * Test calculate 5!.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        int expectant = 120;
        assertThat(result, is(expectant));
    }
    /**
     * Test calculate 0!.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        int expectant = 1;
        assertThat(result, is(expectant));
    }

}
