package kochetov;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * MyLinkedListCycleTest.
 * Created by Сергей on 08.04.2017.
 */
public class MyLinkedListCycleTest {
    /**
     * Test.
     */
    @Test
    public void whenIsCycledValidData() {
        MyLinkedListCycle list = new MyLinkedListCycle();

        list.first.next = list.two;
        list.two.next = list.third;
        list.third.next = list.four;
        list.four.next = list.first;
        
        assertThat(list.hasCycle(list.first), is(true));
    }
    /**
     * Test.
     */
    @Test
    public void whenIsCycledNotValidData() {
        MyLinkedListCycle list = new MyLinkedListCycle();

        list.first.next = list.two;
        list.two.next = list.third;
        list.third.next = list.four;
        list.four.next = null;

        assertThat(list.hasCycle(list.first), is(false));
    }
}