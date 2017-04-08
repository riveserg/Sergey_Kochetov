package kochetov;

import org.junit.Test;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * MyQueueTest.
 * Created by Сергей on 08.04.2017.
 */
public class MyQueueTest {
    /**
     * Test.
     */
    @Test
    public void whenAddElementsToQueueThenMethodPeekReturnFirstElement() {
        MyQueue queue = new MyQueue();
        queue.offer(111);
        queue.offer(222);
        queue.offer(333);
        assertThat(queue.peek(), is(111));
    }
    /**
     * Test.
     */
    @Test
    public void whenAddTwoElementsToQueueThenMethodPoolDelAndReturnElement() {
        MyQueue queue = new MyQueue();
        queue.offer(111);
        queue.offer(222);
        queue.poll();
        assertThat(queue.poll(), is(222));
    }
}