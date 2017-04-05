package kochetov;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Сергей on 05.04.2017.
 */
public class SimpleArrayTest {
    /**
     * Array by test.
     */
    private SimpleArray<Integer> arrayTest;
    /**
     * Test.
     */
    @Before
    public void whenCreateAndAddForTestThenIsOk() {
        this.arrayTest = new SimpleArray<>(5);
        this.arrayTest.add(1);
        this.arrayTest.add(2);
        this.arrayTest.add(3);
    }
    /**
     * Test.
     */
    @Test
    public void whenGetZeroElementThenResultOne() {
        final int expected = 1;
        final int result = this.arrayTest.get(0);
        assertThat(result, is(expected));
    }
    /**
     * Test.
     */
    @Test
    public void whenUpdateFirstElementThenResultNew() {
        final int expected = 33;
        this.arrayTest.update(1, 33);
        final int result = this.arrayTest.get(1);
        assertThat(result, is(expected));
    }
    /**
     * Test.
     */
    @Test
    public void whenDeleteZeroElementThenZeroElementShift() {
        final int expected = 3;
        this.arrayTest.delete(0);
        final int result = this.arrayTest.get(1);
        assertThat(result, is(expected));
    }
    /**
     * Test.
     */
    @Test(expected = RuntimeException.class)
    public void whenWrongDeletionThenWillException() {
        this.arrayTest.delete(4);
    }
}
