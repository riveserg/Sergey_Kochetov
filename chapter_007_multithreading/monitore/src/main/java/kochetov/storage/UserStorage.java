package kochetov.storage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * UserStorage.
 * Created by Сергей on 30.04.2017.
 */
public class UserStorage {
    /**
     * Map of users.
     */
    private final Map<Integer, User> users;
    /**
     * User id in UserStorage.
     */
    private int id;

    /**
     * Constructor.
     */
    public UserStorage() {
        this.users = new ConcurrentHashMap<>();
        this.id = 0;
    }

    /**
     * Add new User to users.
     * @param user - new user
     */
    public void addUser(final User user) {
        this.users.put(this.incId(), user);
    }

    /**
     * Increment user id.
     * @return id + 1.
     */
    private synchronized int incId() {
        return this.id++;
    }

    /**
     * Delete user by id.
     * @param id - user id
     * @return result
     */
    public  synchronized boolean deleteUser(final int id) {
        boolean result = false;
        if (this.users.containsKey(id)) {
            this.users.remove(id);
            result = true;
        }
        return result;
    }

    /**
     * Update user by id.
     * @param id - user id
     * @param user - user
     * @return true if update is ok
     */
    public synchronized boolean updateUser(final int id, final User user) {
        boolean result = false;
        if (this.users.containsKey(id)) {
            this.users.put(id, user);
            result = true;
        }
        return result;
    }

    /**
     *  Search user by id.
     * @param id - user id
     * @return user
     */
    public User read(final int id) {
        User result = null;
        if (this.users.containsKey(id)) {
            result = this.users.get(id);
        }
        return result;
    }

    /**
     * Transfer money from userSrc to userDst.
     * @param amount - money
     * @param userSrc - user donor
     * @param userDst - user recipient
     * @return
     */
    public boolean transferMoney(final int amount, final int userSrc, final int userDst) {
        boolean result = false;
        if (userSrc >= 0 && userSrc <= this.id && userDst >= 0 && userDst <= this.id) {
            final User src = this.users.get(userSrc);
            final User dst = this.users.get(userDst);
           if (src != null && dst != null) {
               final int srcAmount = src.getAmount();
               final int dstAmount = dst.getAmount();
               if (srcAmount >= amount) {
                  this.users.get(userSrc).setAmount(srcAmount - amount);
                  this.users.get(userDst).setAmount(dstAmount + amount);

                  result = true;
               }
           }
        }
        return result;
    }
}
