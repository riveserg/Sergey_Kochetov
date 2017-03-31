package kochetov;

import java.util.HashMap;
import java.util.List;

/**
 * UserConvert.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class UserConvert {
    /**
     *  Method takes a list and converts it into a map with
     *  an Integer key identifier and its corresponding user
     * @param list - list
     * @return HashMap
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User user : list) {
            if (null != user) {
               result.put(user.getId(), user);
            }
        }
        return result;
    }
}
