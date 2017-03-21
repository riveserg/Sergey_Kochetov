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
public class TrackerTest {
    /**
     * Test Add new item.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name1", "text1", "312"));

        String except = "Item{name='name1" + '\'' + ", desc='text1" + '\'' + ", id='312" + '\'' + '}';
        assertThat(tracker.getAll()[0].toString(), is(except));
    }

    /**
     * Test Update item by id.
     */
    @Test
    public void whenUpdateItemThenTrackerHasUpdateItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name33", "text122", "312"));
        Item itemUpd = new Item("name1", "text1", "312");
        tracker.update(itemUpd);

        String except = "Item{name='name1" + '\'' + ", desc='text1" + '\'' + ", id='312" + '\'' + '}';
        assertThat(tracker.getAll()[0].toString(), is(except));
    }

    /**
     * Test Delete item by id.
     */
    @Test
    public void whenDeleteItemThenTrackerHasDeleteItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("name33", "text122", "1"));
        Item item2 = tracker.add(new Item("name33", "text122", "2"));
        Item item3 = tracker.add(new Item("name33", "text122", "3"));
        tracker.delete(new Item("name33", "text122", "3"));
        int result =  tracker.getAll().length;
        int except = 2;
        assertThat(result, is(except));
    }

    /**
     * Test delete all null item.
     */
    @Test
    public void whenDeleteAllNullItemThenTrackerHasDeleteAllNullItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(null);
        Item item2 = tracker.add(new Item("name33", "text122", "2"));
        Item item3 = tracker.add(null);
        int result =  tracker.findAll().length;
        int except = 1;
        assertThat(result, is(except));
    }
    /**
     * Test return all items find by name.
     */
    @Test
    public void whenFindAllItemByNameThenTrackerHasFindAllItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("name1", "text123", "1"));
        Item item2 = tracker.add(new Item("name1", "text122", "2"));
        Item item3 = tracker.add(new Item("name1", "text122", "3"));
        Item item4 = tracker.add(new Item("name2", "text124", "4"));
        int result =  tracker.findByName("name1").length;
        int except = 3;
        assertThat(result, is(except));
    }
    /**
     * Test return items find by ID.
     */
    @Test
    public void whenFindItemByIdThenTrackerHasFindItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("name1", "text123", "111"));
        Item item2 = tracker.add(new Item("name1", "text122", "2"));
        String result =  tracker.findById("111").getId();
        String  except = "111";
        assertThat(result, is(except));
    }
}
