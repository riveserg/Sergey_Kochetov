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
public class TurnTest {
    /**
     *  Test method. Flip an array for an even number.
     */
    @Test
    public void whenFlipAnArrayForAnEvenNumberThenArrayOverturned() {
        Turn turn = new Turn();
        int[] result = turn.back(new int[] {2, 6, 1, 4});
        int[] expected = new int[] {4, 1, 6, 2};
        assertThat(result, is(expected));
    }

    /**
     *  Test method. Turn the array for an odd number.
     */
    @Test
    public void whenTurnTheArrayForAnOddNumberThenArrayOverturned() {
        Turn turn = new Turn();
        int[] result = turn.back(new int[] {5, 4, 3, 2, 1});
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expected));
    }

}
