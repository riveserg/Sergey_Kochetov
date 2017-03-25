package kochetov.start;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * StartUITest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class StartUITest {
    /**
     * Test.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("test name"));
    }

    /**
     * Test.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameDesc() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getDesc(), is("desc"));
    }

    /**
     * Test
     */
    @Test
    public void whenUserAddTwoItemThenTrackerHasNewTwoItemWithPrint() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "aaa", "bbb", "0", "zzz", "xxx", "6"});
        new StartUI(input, tracker).init();
        final int  expect = 2;
        assertThat(tracker.findAll().length, is(expect));
    }
    /**
     * Test
     */
    @Test
    public void whenUserAddItemAndUpdateThenTrackerHasNewUpdate() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "aaa", "bbb", "0", "zzz", "xxx", "6"});
        new StartUI(input, tracker).init();
        final int  expect = 2;
        assertThat(tracker.findAll().length, is(expect));
    }
}
