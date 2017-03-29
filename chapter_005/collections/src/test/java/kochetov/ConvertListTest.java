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
    public void whenItComesToTheSheetThenItIsConvertedToAnArray() {
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
}
