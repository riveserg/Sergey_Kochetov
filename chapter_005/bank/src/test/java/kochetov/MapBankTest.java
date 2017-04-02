package kochetov;

import kochetov.exception.UserNotFoundException;
import kochetov.model.Account;
import kochetov.model.User;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MapBankTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class MapBankTest {
    /**
     * Test.
     */
    @Test
    public void whenAddUserThenMapBankAddUserToAccounts(){
        MapBank mapBank = new MapBank();
        User user1 = new User("name1", "passport1");
        mapBank.addUser(user1);
        final int expected = 1;
        assertThat(mapBank.getAccounts().size(), is(expected));
    }
    /**
     * Test.
     */
    @Test(expected = UserNotFoundException.class)
    public void whenAddNullUserThenMapBankThrowsException(){
        MapBank mapBank = new MapBank();
        User user = null;
        mapBank.addUser(user);
    }
    /**
     * Test.
     */
    @Test
    public void whenDeleteUserThenMapBankDeleteUserFromAccounts(){
        MapBank mapBank = new MapBank();
        User user1 = new User("name1", "passport1");
        User user2 = new User("name2", "passport2");
        mapBank.addUser(user1);
        mapBank.addUser(user2);
        mapBank.deleteUser(user1);
        final int expected = 1;
        assertThat(mapBank.getAccounts().size(), is(expected));
    }

    /**
     * Test.
     */
    @Test
    public void whenAddAccountToUserThenMapBankAddAccountValueIsZero(){
        MapBank mapBank = new MapBank();
        User user1 = new User("name1", "passport1");
        Account account1 = new Account("1");
        mapBank.addUser(user1);
        mapBank.addAccountToUser(user1, account1);
        final double result = mapBank.getAccountAmount(user1, account1);
        final double expected = 0.0d;
        assertThat(result, is(expected));
    }
    /**
     * Test.
     */
    @Test
    public void whenAddTwoAccToUserAndOneAccDelThenMapBankUserAccountValueIsOne(){
        MapBank mapBank = new MapBank();
        User user1 = new User("name1", "passport1");
        Account account1 = new Account("1");
        Account account2 = new Account("2");
        mapBank.addUser(user1);
        mapBank.addAccountToUser(user1, account1);
        mapBank.addAccountToUser(user1, account2);
        mapBank.deleteAccountFromUser(user1, account1);
        final int result = mapBank.getListAccount(user1).size();
        final int expected = 1;
        assertThat(result, is(expected));
    }

    /**
     * Test.
     *
     */
    @Test
    public void whenIncorrectTransferMoneyThenIsNotOk(){
        MapBank mapBank = new MapBank();
        User user1 = new User("name1", "passport1");
        Account account1 = new Account("1");
        mapBank.addUser(user1);
        mapBank.addAccountToUser(user1, account1);

        User user2 = new User("name1", "passport1");
        Account account2 = new Account("2");
        mapBank.addUser(user2);
        mapBank.addAccountToUser(user2, account2);

        final boolean result = mapBank.transferMoney(user1, account1, user2, account2, 100);

        final boolean expected = false;
        assertThat(result, is(expected));
    }
    /**
     * Test.
     */
    @Test
    public void whenCorrectTransferMoneyThenIsOk(){
        MapBank mapBank = new MapBank();
        User user1 = new User("name1", "passport1");
        Account account1 = new Account("1");
        account1.addMoney(100);
        account1.addMoney(100);
        mapBank.addUser(user1);
        mapBank.addAccountToUser(user1, account1);


        User user2 = new User("name2", "passport2");
        Account account2 = new Account("2");
        account2.addMoney(200);
        mapBank.addUser(user2);
        mapBank.addAccountToUser(user2, account2);

        final boolean result = mapBank.transferMoney(user1, account1, user2, account2, 50);

        final boolean expected = true;
        assertThat(result, is(expected));
    }
    /**
     * Test.
     */
    @Test
    public void whenCorrectTransferMoneyThenIsOk2(){
        MapBank mapBank = new MapBank();
        User user1 = new User("name1", "passport1");
        Account account1 = new Account("1");
        mapBank.addUser(user1);
        mapBank.addAccountToUser(user1, account1);

        User user2 = new User("name2", "passport2");
        Account account2 = new Account("2");
        account2.addMoney(200);
        mapBank.addUser(user2);
        mapBank.addAccountToUser(user2, account2);

        final boolean result = mapBank.transferMoney(user1, account2, user2, account2, 50);

        final boolean expected = false;
        assertThat(result, is(expected));
    }

}
