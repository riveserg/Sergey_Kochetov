package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * RotateArrayTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    /**
     * Method test. Sorting array of strings.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(new String[]
                {"Привет", "Мир", "Привет", "Супер", "Мир"});
        String[] expected = new String[]{"Привет", "Мир", "Супер"};
        assertThat(result, is(expected));
    }
}
