package kochetov;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Сергей on 04.04.2017.
 */
public class IteratorConvertTest {
    /**
     * Test
     */
    @Test
    public void whenIteratorGetsALotOfIteratorsThenItReturnsASingleIterator() {
        Iterator<Iterator<Integer>> iterator = Arrays.asList(
                Arrays.asList(4, 2, 0, 4, 6, 4, 9).iterator(),
                Arrays.asList(0, 9, 8, 7, 5).iterator(),
                Arrays.asList(1, 3, 5, 6, 7, 0, 9, 8, 4).iterator())
                .iterator();

        Converter converter = new IteratorConvert();
        Iterator<Integer> convertedIterator = converter.convert(iterator);
        final List<Integer> result = new ArrayList<Integer>();
        while (convertedIterator.hasNext()) {
            result.add(convertedIterator.next());
        }
        final List<Integer> expected = Arrays.asList(4, 2, 0, 4, 6, 4, 9, 0, 9, 8, 7, 5, 1, 3, 5, 6, 7, 0, 9, 8, 4);

        assertThat(result, is(expected));
    }
}
