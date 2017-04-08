package kochetov;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * SetArrayTest.
 * Created by Сергей on 08.04.2017.
 */
public class SetArrayTest {
    /**
     * Test.
     */
    @Test
    public void whenAddElementThenIsOk() {
        SetArray set = new SetArray(10);
        set.add("111");
        set.add("111");
        assertThat(set.size(), is(1));
    }
    /**
     * Test.
     */
    @Test
    public void whenAddTwoElementAndRemoveOneThenIsOk() {
        SetArray set = new SetArray(10);
        set.add("111");
        set.add("222");
        set.remove("111");
        Iterator itr = set.iterator();
        assertThat( itr.next(), is("222"));
    }
    /**
     * Test.
     */
    @Test
    public void whenIteratorNextThenResultFirstElement() {
        SetArray set = new SetArray(10);
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
        SetArray set = new SetArray(10);

        Iterator itr = set.iterator();
        assertThat(itr.next(), is(""));
    }
}
