package kochetov;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Сергей on 02.04.2017.
 */
public class IteratorEvenNumbersTest {

        /**
         * Test an iterator that returns only the even numbers.
         * If iterator take array {1, 2, 3, 4, 5, 6} should method next return {2, 4, 6}.
         */
        @Test
        public void whenTakeArrayShouldMethodNextThenMethodNextReturnElementArray() {
            final IteratorEvenNumbers it = new IteratorEvenNumbers(new int[]{1, 2, 3, 4, 5, 6});

            final int[] expectedArray = new int[]{2, 4, 6};
            final int[] result = new int[3];
            int count = 0;
            while (it.hasNext()){
                result[count++] = it.next();
            }
            assertThat(expectedArray, is(result));
        }
}
