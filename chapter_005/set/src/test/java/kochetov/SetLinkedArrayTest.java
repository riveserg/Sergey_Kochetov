package kochetov;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * SetLinkedArrayTest.
 * Created by Сергей on 08.04.2017.
 */
public class SetLinkedArrayTest {
    /**
     * Test.
     */
    @Test
    public void whenAddTwoElementThenSizeIsTwo() {
        SetLinkedArray set = new SetLinkedArray();
        set.add("111");
        set.add("222");
        assertThat(set.size(), is(2));
    }
    /**
     * Test.
     */
    @Test
    public void whenIteratorNextThenResultFirstElement() {
        SetLinkedArray set = new SetLinkedArray();
        set.add("222");
        set.add("111");

        Iterator itr = set.iterator();

        assertThat(itr.next(), is("222"));
    }
    /**
     * Test.
     */
    @Test(expected = NoSuchElementException.class)
    public void whenIteratorNextThenResultThrowException() {
        SetLinkedArray set = new SetLinkedArray();

        Iterator itr = set.iterator();
        assertThat(itr.next(), is(""));
    }
}