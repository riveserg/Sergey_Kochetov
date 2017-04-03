package kochetov;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Сергей on 03.04.2017.
 */
public class IteratorPrimeNumbersTest {

    /**
     * Test an iterator that returns only the prime numbers.
     * If iterator take array {2, 3, 4, 5, 6, 7, 11, 21, 32, 33, 51, 121, 223}
     * should method next return {2, 3, 5, 7, 11, 223}.
     */
    @Test
    public void whenTakeArrayShouldMethodNextThenMethodNextReturnPrimeNumberArray() {
        final IteratorPrimeNumbers it = new IteratorPrimeNumbers(new int[]{2, 3, 4, 5, 6, 7, 11, 21, 32, 33, 51, 121, 223});

        final int[] expectedArray = new int[]{2, 3, 5, 7, 11, 223};
        final int[] result = new int[6];
        int count = 0;
        while (it.hasNext()){
            result[count++] = it.next();
        }
        assertThat(expectedArray, is(result));
    }
}
