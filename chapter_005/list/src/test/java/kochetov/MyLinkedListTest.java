package kochetov;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * MyLinkedListTest.
 * Created by Сергей on 08.04.2017.
 */
public class MyLinkedListTest {

    /**
     * Test.
     */
    @Test
    public void whenAddElementToLinkedListThenMethodGetReturnTheCorrectValue() {
        MyLinkedList list = new MyLinkedList();
        list.add(111);
        list.add(222);
        list.add(333);
        assertThat(list.get(2), is(333));
    }
    /**
     * Test.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void whenDontAddElementsThenMethodGetThrowException() {
        MyLinkedList list = new MyLinkedList();
        list.get(0);
    }
    /**
     * Test.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void whenAddOneElementAndMethodGetCallFirstElementThenReturnThrowException() {
        MyLinkedList list = new MyLinkedList();
        list.add("111");
        assertThat(list.get(1), is(111));

    }

    /**
     * Test.
     */
    @Test
    public void whenIteratorNextThenResultNextElement() {
        MyLinkedList list = new MyLinkedList();
        list.add("111");
        list.add("222");
        Iterator iterator = list.iterator();
        assertThat(iterator.next(), is("111"));
    }

}