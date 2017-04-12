package kochetov;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * ReferenceBookTest.
 * Created by Сергей on 12.04.2017.
 */
public class ReferenceBookTest {
    /**
     * Test.
     */
    @Test
    public void whenAddTwoElementThenSizeIsOne() {
        ReferenceBook ref = new ReferenceBook();
        ref.insert("1", 100);
        ref.insert("1", 200);
        assertThat(ref.size(), is(1));
    }
    /**
     * Test.
     */
    @Test
    public void whenAddTwoElementThenValueSecondElementIsRight() {
        ReferenceBook ref = new ReferenceBook();
        ref.insert("1", 100);
        ref.insert("1", 200);
        assertThat(ref.get("1"), is(200));
    }
    /**
     * Test.
     */
    @Test
    public void whenAddTwoElementAndDeleteOneElementThenSizeIsOne() {
        ReferenceBook ref = new ReferenceBook();
        ref.insert("1", 100);
        ref.insert("2", 200);
        ref.delete("1");
        assertThat(ref.size(), is(1));
    }
    /**
     * Test.
     */
    @Test
    public void whenIteratorNextThenResultFirstElement() {
        ReferenceBook ref = new ReferenceBook();
        ref.insert("1", 100);
        ref.insert("2", 200);

        Iterator itr = ref.iterator();

        assertThat(itr.next().toString(), is("key=1 value=100"));
    }
    /**
     * Test.
     */
    @Test(expected = NoSuchElementException.class)
    public void whenIteratorNextThenResultThrowException() {
        ReferenceBook ref = new ReferenceBook();

        Iterator itr = ref.iterator();
        assertThat(itr.next(), is(""));
    }




}