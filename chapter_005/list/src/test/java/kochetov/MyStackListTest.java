package kochetov;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by Сергей on 08.04.2017.
 */
public class MyStackListTest {
    /**
     * Test.
     */
    @Test
    public void whenAddElementsToStackThenMethodPeekReturnLastElement() {
        MyStackList stack = new MyStackList();
        stack.push(111);
        stack.push(222);
        stack.push(333);
        assertThat(stack.peek(), is(333));
    }
    /**
     * Test.
     */
    @Test
    public void whenAddElementsToStackAndDelThenMethodPeekReturnLastElement() {
        MyStackList stack = new MyStackList();
        stack.push(111);
        stack.push(222);
        stack.push(333);
        assertThat(stack.pop(), is(333));
    }


}