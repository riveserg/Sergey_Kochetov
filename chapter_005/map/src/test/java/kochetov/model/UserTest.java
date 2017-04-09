package kochetov.model;

import org.junit.Test;

import java.util.GregorianCalendar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * UserTest.
 * Created by Сергей on 09.04.2017.
 */
public class UserTest {
    /**
     * Test.
     */
    @Test
    public void whenUser1EqualsUser2ThenWillBeFalse() {
        final User user1 = new User("name1", 1, new GregorianCalendar(1,1,1));
        final User user2 = new User("name1", 1, new GregorianCalendar(1,1,1));
        assertThat(user1.equals(user2), is(false));
    }
    /**
     * Test.
     */
    @Test
    public void whenUser1EqualsUser2ThenWillBeTrue() {
        final User user1 = new User("name1", 1, new GregorianCalendar(1,1,1));
        final User user2 = user1;
        assertThat(user1.equals(user2), is(true));
    }
}
