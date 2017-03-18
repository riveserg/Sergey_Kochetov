package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ArrayDuplicate.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class ArrayFinalTaskTest {
    /**
     * Test method. Substring consists of string.
     */
    @Test
    public void whenSubstringIsIncludedStringThenTrue() {
        ArrayFinalTask arrayFinalTask = new ArrayFinalTask();
        boolean result = arrayFinalTask.contains("String string", "ing st");
        boolean expected = true;
        assertThat(result, is(expected));
    }
    /**
     * Test method. Substring not consists of string.
     */
    @Test
    public void whenSubstringIsIncludedStringThenFalse() {
        ArrayFinalTask arrayFinalTask = new ArrayFinalTask();
        boolean result = arrayFinalTask.contains("String string", "ingst");
        boolean expected = false;
        assertThat(result, is(expected));
    }
}
