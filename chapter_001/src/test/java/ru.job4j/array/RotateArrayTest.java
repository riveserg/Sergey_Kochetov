package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * RotateArrayTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class RotateArrayTest {
    /**
     *  Method test. Turn clockwise by 90 degrees array 2x2.
     */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
        int[][] result = rotateArray.rotate(new int[][] {
                {1, 2},
                {3, 4}
        });
        int[][] expected = new int[][] {
                {3, 1},
                {4, 2}
        };
        assertThat(result, is(expected));
    }
    /**
     *  Method test. Turn clockwise by 90 degrees array 3x3.
     */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
        int[][] result = rotateArray.rotate(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        int[][] expected = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        assertThat(result, is(expected));
    }
    /**
     *  Method test. Turn clockwise by 90 degrees array 4x4.
     */
     @Test
     public void whenRotateFourRowFourColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
        int[][] result = rotateArray.rotate(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        });
        int[][] expected = new int[][]{
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };
        assertThat(result, is(expected));
     }

}
