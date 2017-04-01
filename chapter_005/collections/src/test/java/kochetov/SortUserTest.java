package kochetov;

import kochetov.model.*;
import kochetov.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
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
    /**
     * Test.
     */
    @Test
    public void whenListSortedHimByHashCode() {
        SortUser sortUser = new SortUser();
        ArrayList<kochetov.model.User> list = new ArrayList<>();
        list.add(new kochetov.model.User("name1", 70));
        list.add(new kochetov.model.User("name2", 41));
        list.add(new kochetov.model.User("name3", 81));
        list.add(new kochetov.model.User("name4", 11));

        List<kochetov.model.User> listTwo = sortUser.sortHash(list);

        String str = "";
        for (kochetov.model.User user : listTwo) {
            str = String.format("%s %d", str, user.hashCode());
        }
        final String result = " -1052833280 -1052833278 -1052833246 -1052833207";

        assertThat(str, is(result));
    }

    /**
     * Test.
     */
    @Test
    public void whenListSortedHimByNameLength() {
        SortUser sortUser = new SortUser();
        ArrayList<kochetov.model.User> list = new ArrayList<>();
        list.add(new kochetov.model.User("name1111", 70));
        list.add(new kochetov.model.User("name22", 41));
        list.add(new kochetov.model.User("name333", 81));
        list.add(new kochetov.model.User("name4", 11));

        List<kochetov.model.User> listTwo = sortUser.sortLength(list);

        String str = "";
        for (kochetov.model.User user : listTwo) {
            str = String.format("%s %d", str, user.getName().length());
        }
        final String result = " 5 6 7 8";

        assertThat(str, is(result));
    }
}
