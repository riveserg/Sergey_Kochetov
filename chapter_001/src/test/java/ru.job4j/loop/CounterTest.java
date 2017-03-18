package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CounterTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class CounterTest {
    /**
     * Test calculate the sum of even numbers from one to 10.
     */
    @Test
    public void whenSumNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        int except = 30;
        assertThat(result, is(except));
    }
}
