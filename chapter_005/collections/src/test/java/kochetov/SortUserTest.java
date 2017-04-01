package kochetov;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * SortUserTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class SortUserTest {
    /**
     * Test.
     */
    @Test
    public void whenSetAddListAndSortedHimByAge() {
        SortUser sortUser = new SortUser();
        ArrayList<kochetov.model.User> list = new ArrayList<>();
        list.add(new kochetov.model.User("name1", 70));
        list.add(new kochetov.model.User("name2", 41));
        list.add(new kochetov.model.User("name3", 81));
        list.add(new kochetov.model.User("name4", 11));
        Set<kochetov.model.User> set = sortUser.sort(list);

        String str = "";
        for (kochetov.model.User user : set) {
            str = String.format("%s %d", str, user.getAge());
        }
        final String result = " 11 41 70 81";

        assertThat(str, is(result));
    }

}
