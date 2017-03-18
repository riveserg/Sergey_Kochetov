package ru.job4j.array;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BubbleSortTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class BubbleSortTest {
    /**
     *  Test method. Bubble sort.
     */
    @Test
    public void whenServedNotASortedArrayThenItIsSorted() {
        BubbleSort turn = new BubbleSort();
        int[] result = turn.sort(new int[] {5, 1, 2, 7, 3});
        int[] expected = new int[] {1, 2, 3, 5, 7};
        assertThat(result, is(expected));
    }
}
