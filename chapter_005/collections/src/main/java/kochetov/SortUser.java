package kochetov;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
}
