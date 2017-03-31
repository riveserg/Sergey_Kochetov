package kochetov.start;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;

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
     * Byte Array Output Stream.
     */
    private  ByteArrayOutputStream out;

    /**
     * initial ByteArrayOutputStream.
     */
    @Before
    public void initBAOS() {
        out = new ByteArrayOutputStream();
    }

    /**
     * Test.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name"));
    }

    /**
     * Test.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameDesc() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getDesc(), is("desc"));
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
        assertThat(tracker.findAll().size(), is(expect));
    }
    /**
     * Test
     */
    @Test
    public void whenUserAddItemAndUpdateThenTrackerHasNewUpdate() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "aaa", "bbb", "2", "1", "zzz", "xxx", "1", "6"});

        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).init();

        final String  expect = String.format("id: 1 name: zzz desc: xxx%s", System.getProperty("line.separator"));
        assertThat(out.toString(), is(expect));
    }

    /**
     * Test
     */
    @Test(expected = NumberFormatException.class)
    public void whenUserEnterIncorrectDataThenTrackerCreateNewMenuException() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"aaa", "aaa", "bbb", "3", "1", "6"});
        new StartUI(input, tracker).init();
    }
    /**
     * Test
     */
    @Test
    public void whenUserCreateItemAndDelHimThenTrackerCreateNewLogic() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "aaa", "bbb", "3", "1", "6"});
        new StartUI(input, tracker).init();
        final int  expect = 0;
        assertThat(tracker.findAll().size(), is(expect));
    }
    /**
     * Test
     */
    @Test
    public void whenUserCreateItemAndFindHimByIdThenTrackerCreateNewLogic() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "aaa", "bbb", "4", "1", "6"});
        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).init();

        final String expect = String.format("Item{name='aaa', desc='bbb'}%s", System.getProperty("line.separator"));
        assertThat(out.toString(), is(expect));
    }
    /**
     * Test
     */
    @Test
    public void whenUserCreateItemAndFindHimByNameThenTrackerCreateNewLogic() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "aaa", "bbb", "5", "aaa", "6"});
        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).init();

        final String expect = String.format("Item{name='aaa', desc='bbb'}%s", System.getProperty("line.separator"));
        assertThat(out.toString(), is(expect));
    }
    /**
     * Close Byte Array Output Stream.
     * @throws IOException - exception
     */
    @After
    public void close() throws IOException {
        out.close();
    }

}
