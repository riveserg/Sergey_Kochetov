package ru.job4j.array;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * TurnTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class TwoArrayTest {
    /**
     *  Test two arrays are sorted correctly.
     */
    @Test
    public void whenTwoArraysAreSortedCorrectlyThenGood() {
        TwoArray twoArray = new TwoArray();
        int[] result = twoArray.mergeTwoArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4});
        int[] expected = new int[] {1, 1, 2, 2, 3, 3, 4};
        assertThat(result, is(expected));
    }
    /**
     *  Test one array is null.
     */
    @Test
    public void whenOneArrayIsNullThenNull() {
        TwoArray twoArray = new TwoArray();
        int[] result = twoArray.mergeTwoArrays(null, new int[]{1, 2});
        int[] expected = null;
        assertThat(result, is(expected));
    }
}
