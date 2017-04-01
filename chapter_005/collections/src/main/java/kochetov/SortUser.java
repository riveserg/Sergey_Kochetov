package kochetov;

import kochetov.model.User;

import java.util.*;

/**
 * SortUser.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class SortUser {
    /**
     * Method sorted list.
     * @param list - list
     * @return result set
     */
    public Set<kochetov.model.User> sort (List<kochetov.model.User> list) {
        Set<kochetov.model.User> result = new TreeSet<>();
        for (kochetov.model.User user : list) {
            result.add(user);
        }
        return result;
    }

    /**
     * Method sorted by hashcode.
     * @return sorted list
     */
    public List<kochetov.model.User> sortHash (List<kochetov.model.User> list) {
        Comparator<kochetov.model.User> comparator = new Comparator<kochetov.model.User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.hashCode() == o2.hashCode() ? 0 : o1.hashCode() > o2.hashCode() ? 1 : -1;
            }
        };
        list.sort(comparator);
        return list;
    }
    /**
     * Method sorted by length name.
     * @return sorted list
     */
    public List<User> sortLength (List<User> list) {
        Comparator<kochetov.model.User> comparator = new Comparator<kochetov.model.User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().length() == o2.getName().length() ? 0 : o1.getName().length() > o2.getName().length() ? 1 : -1;
            }
        };
        list.sort(comparator);
        return list;
    }
}
