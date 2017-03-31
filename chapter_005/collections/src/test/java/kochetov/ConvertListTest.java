package kochetov;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ConvertListTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class ConvertListTest {
    /**
     * Test.
     */
    @Test
    public void whenItComesToTheTwoDimensionalArrayThenItIsConvertedToList() {
        ConvertList convertList = new ConvertList();
        final int[][] arrays = {{0,1}, {2,3}};

        final int expected = convertList.toList(arrays).size();
        final int result = 4;

        assertThat(result, is(expected));
    }
    /**
     * Test.
     */
    @Test
    public void whenItComesToTheListThenItIsConvertedToAnArray() {
        ConvertList convertList = new ConvertList();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            list.add(i);
        }
        final int[][] expected = convertList.toArray(list, 3);
        final int[][] result = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expected));
    }

    /**
     * Test.
     */
    @Test
    public void whenConversionListArraysInASingleIntegerWorksheet() {
        ConvertList convertList = new ConvertList();
        List<int[]> list = new ArrayList<>();

        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});

        List<Integer> expected = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            expected.add(i);
        }
        List<Integer> result = convertList.convert(list);
        assertThat(result, is(expected));
    }
}
