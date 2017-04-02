package kochetov;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Сергей on 02.04.2017.
 */
public class IteratorArrayTest {
    /**
     * Test a two-dimensional array of the correct form.
     * If iterator take array {{1, 2}, {3, 4}} should method next return {1, 2, 3, 4}.
     */
    @Test
    public void whenTakeArrayShouldMethodNextThenMethodNextReturnElementArray() {
        final IteratorArray it = new IteratorArray(new int[][]{{1, 2}, {3, 4}});

        final int[] expectedArray = new int[]{1, 2, 3, 4};
        final int[] result = new int[4];
        int count = 0;
        while (it.hasNext()){
            result[count++] = it.next();
        }
        assertThat(expectedArray, is(result));
    }
    /**
     * Test a two-dimensional array is not the correct form.
     * If iterator take array {{1}, {2, 3, 4}} should method next return {1, 2, 3, 4}.
     */
    @Test
    public void whenTakeArrayShouldMethodNextThenMethodNextReturnElementArray2() {
        final IteratorArray it = new IteratorArray(new int[][]{{1}, {2, 3, 4}});

        final int[] expectedArray = new int[]{1, 2, 3, 4};
        final int[] result = new int[4];
        int count = 0;
        while (it.hasNext()){
            result[count++] = it.next();
        }
        assertThat(expectedArray, is(result));
    }
}
