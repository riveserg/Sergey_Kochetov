package kochetov;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * MyArrayListTest.
 * Created by Сергей on 07.04.2017.
 */
public class MyArrayListTest {
    /**
     * Test.
     */
    @Test
    public void whenAddElementThenIsOk() {
        MyArrayList list = new MyArrayList();
        list.add(111);
        assertThat(list.get(0), is(111));
    }
    /**
     * Test.
     */
    @Test
    public void whenCreateArrayAndAddTwoElementsThenSizeIsTwo() {
        MyArrayList list = new MyArrayList();
        list.add("111");
        list.add("222");
        assertThat(list.size(), is(2));
    }
    /**
     * Test hasNext().
     */
    @Test
    public void whenHasNextInEmptyArrayListThenResultFalse() {
        MyArrayList list = new MyArrayList();
        Iterator iterator = list.iterator();
        assertThat(iterator.hasNext(), is(false));
    }
    /**
     * Test hasNext().
     */
    @Test
    public void whenHasNextThenResultTrue() {
        MyArrayList list = new MyArrayList();
        list.add(111);
        Iterator iterator = list.iterator();
        assertThat(iterator.hasNext(), is(true));
    }
    /**
     * Test.
     */
    @Test
    public void whenNextTwoTimesThenResultSecondElement() {
        MyArrayList list = new MyArrayList();
        list.add(111);
        list.add(222);
        Iterator iterator = list.iterator();
        iterator.next();
        assertThat(iterator.next(), is(222));
    }

    /**
     * Test.
     */
    @Test(expected = NoSuchElementException.class)
    public void whenNextInEmptyListThenThrowsException() {
        MyArrayList list = new MyArrayList();
        Iterator itr = list.iterator();
        itr.next();
    }
}