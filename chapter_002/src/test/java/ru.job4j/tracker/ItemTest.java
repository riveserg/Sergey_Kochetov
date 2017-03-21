package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ItemTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class ItemTest {
    /**
     *  Test item(not null) constructor().
     */
    @Test
    public void whenCreateItemThenToString() {
        Item item = new Item("name1", "text1", "312");
        String result = item.toString();
        String except = "Item{name='name1" + '\'' + ", desc='text1" + '\'' + ", id='312" + '\'' + '}';
        assertThat(result, is(except));
    }
    /**
     *  Test item(null) constructor().
     */
    @Test
    public void whenCreateNullItemThenToString() {
        Item item = new Item();
        String result = item.toString();
        String except = "null";
        assertThat(result, is(except));
    }

}
