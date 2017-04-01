package kochetov;

import kochetov.exception.UserNotFoundException;
import kochetov.model.Account;
import kochetov.model.User;

import java.util.*;

/**
 * MapBank.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class MapBank {
    /**
     * A list of Bank accounts of the user.
     */
    private Map<User, List<Account>> accounts = new HashMap<>();

    /**
     * Getter.
     * @return accounts
     */
    public Map<User, List<Account>> getAccounts() {
        return this.accounts;
    }

    /**
     * Getter.
     * @param user - user
     * @return list account by user
     */
    public List<Account> getListAccount(User user){
        if (user == null) {
            throw new UserNotFoundException();
        } else {
            return  this.accounts.get(user);
        }
    }


    /**
     * Add user.
     * @param user - user
     */
    public void addUser(User user) {
        if (user != null) {
            this.accounts.put(user, new ArrayList<Account>());
        } else {
            throw new UserNotFoundException();
        }
    }

    /**
     * Delete user.
     * @param user - user
     */
    public void deleteUser(User user) {
        if (user != null) {
            Iterator<Map.Entry<User, List<Account>>> it = this.accounts.entrySet().iterator();
           while (it.hasNext()) {
               if (it.next().getKey().equals(user)) {
                   it.remove();
                   break;
               }
           }
        } else {
            throw new UserNotFoundException();
        }
    }

    /**
     * Method to add account to the user.
     * @param user - user
     * @param account - account
     */
    public void addAccountToUser(User user, Account account) {
        if (user == null) {
            throw new UserNotFoundException();
        }
        for (Map.Entry<User, List<Account>> map : this.accounts.entrySet()) {
            if (map.getKey().equals(user)) {
               map.getValue().add(account);
            }
        }
    }
    /**
     * Method to delete account to the user.
     * @param user - user
     * @param account - account
     */
    public void deleteAccountFromUser(User user, Account account) {
        if (user == null) {
            throw new UserNotFoundException();
        }
        for (Map.Entry<User, List<Account>> map : this.accounts.entrySet()) {
            if (map.getKey().equals(user)) {
                map.getValue().remove(account);
            }
        }
    }

    /**
     * Method to obtain a list of accounts for a user.
     * @param user - user
     * @return list account
     */
    public List<Account> getUserAccount(User user) {
        List<Account> result = null;
        if (user == null) {
            throw new UserNotFoundException();
        }
        for (Map.Entry<User, List<Account>> map : this.accounts.entrySet()) {
            if (map.getKey().equals(user)) {
                result = map.getValue();
            }
        }
        return result;
    }

    /**
     * Method for transferring money from one account to another account:
     * if the account is not found or not enough money in the account
     * srcAccount (from which transferred) should return false.
     * @param srcUser - src
     * @param srcAccount src acc
     * @param dstUser - dst user
     * @param dstAccount - dst acc
     * @param amount - amount
     * @return if execute is true.
     */
    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        boolean result = false;
            if (srcUser != null && srcAccount != null && dstUser != null && dstAccount != null)
            if (this.getAccountAmount(srcUser, srcAccount) >= amount) {
              for (Account acc : this.accounts.get(srcUser)){
                  if (acc.getRequisites().equals(srcAccount.getRequisites())) {
                      acc.writeOffMoney(amount);
                  }
              }
                for (Account acc : this.accounts.get(dstUser)){
                    if (acc.getRequisites().equals(dstAccount.getRequisites())) {
                        acc.addMoney(amount);
                    }
                }
                result = true;
            }

        return result;
    }

    /**
     * Method shows how many user account.
     * @param user - user
     * @param account - account
     * @return money in the account
     */
    public double getAccountAmount(User user, Account account) {
        double result = 0;
        if (user != null) {
            for (Account acc : this.accounts.get(user)) {
                if (acc.equals(account)) {
                    result = acc.getValue();
                }
            }
        } else {
            throw new UserNotFoundException();
        }
        return result;
    }
}
