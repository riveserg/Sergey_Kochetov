package kochetov;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * UserConvertTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class UserConvertTest {

    /**
     * Test.
     */
    @Test
    public void whenAListOfUsersConvertToMap() {
        UserConvert userConvert = new UserConvert();

        List<User> list = new ArrayList<>();
        User user1 = new User(1, "name1", "city1");
        User user2 = new User(2, "name2", "city2");
        list.add(user1);
        list.add(user2);
        list.add(null);

        final HashMap<Integer, User> map = userConvert.process(list);

        final HashMap<Integer, User> result = new HashMap<>();
        result.put(1, user1);
        result.put(2, user2);

        assertThat(result, is(map));
    }
}
