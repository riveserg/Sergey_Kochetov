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
        Item item = tracker.add(new Item("name1", "text1"));
        final String except = String.format("Item{name='%s', desc='%s'}", "name1", "text1");
        assertThat(tracker.getAll()[0].toString(), is(except));
    }

    /**
     * Test Update item by id.
     */
    @Test
    public void whenUpdateItemThenTrackerHasUpdateItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name22", "text122"));
        item.setName("name1");
        item.setDesc("text1");
        tracker.update(item);

        final String except = String.format("Item{name='%s', desc='%s'}", "name1", "text1");
        assertThat(tracker.getAll()[0].toString(), is(except));
    }

    /**
     * Test Delete item by id.
     */
    @Test
    public void whenDeleteItemThenTrackerHasDeleteItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("name33", "text122"));
        Item item2 = tracker.add(new Item("name33", "text122"));
        Item item3 = tracker.add(new Item("name33", "text122"));
        tracker.delete(item2);
        final int result =  tracker.findAll().length;
        final int except = 2;
        assertThat(result, is(except));
    }

    /**
     * Test delete all null item.
     */
    @Test
    public void whenDeleteAllNullItemThenTrackerHasDeleteAllNullItem() {
        Tracker tracker = new Tracker();
        Item item2 = tracker.add(new Item("name33", "text122"));
        Item item1 = tracker.add(null);
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
        Item item1 = tracker.add(new Item("name1", "text123"));
        Item item2 = tracker.add(new Item("name1", "text122"));
        Item item3 = tracker.add(new Item("name1", "text122"));
        Item item4 = tracker.add(new Item("name2", "text124"));
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
        Item item1 = tracker.add(new Item("name1", "text123"));
        Item item2 = tracker.add(new Item("name1", "text122"));
        String id = item1.getId();
        String result =  tracker.findById(id).getId();
        String  except = id;
        assertThat(result, is(except));
    }
}
