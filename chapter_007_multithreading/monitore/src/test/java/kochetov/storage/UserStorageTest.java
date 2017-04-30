package kochetov.storage;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * UserStorageTest.
 * Created by Сергей on 30.04.2017.
 */
public class UserStorageTest {

    /**
     * Test.
     */
    @Test
    public void whenDeleteUserWithIdOneThenResultNoUserInStorage() {
        UserStorage stor = new UserStorage();

        stor.addUser(new User("Test", 100));
        stor.addUser(new User("Test", 100));

        stor.deleteUser(1);

        assertNull(stor.read(1));
    }

    /**
     * Test.
     */
    @Test
    public void whenUpdateUserThenUserWithNewAmount() {
        UserStorage stor = new UserStorage();

        stor.addUser(new User("Test", 100));
        stor.addUser(new User("Test", 100));

        User updUser = new User("UpdUser", 100);

        stor.updateUser(1, updUser);
        assertThat(stor.read(1).getName(), is("UpdUser"));
    }

    /**
     * Test.
     */
    @Test
    public void whenTransferMoneyFromSrcUserToDstUserThenSecondUserHasMoreMoney() {
        UserStorage stor = new UserStorage();

        stor.addUser(new User("Test", 100));
        stor.addUser(new User("Test", 100));

        stor.transferMoney(30, 0, 1);
        assertThat(stor.read(1).getAmount(), is(130));
    }

    /**
     * Test.
     */
    @Test
    public void whenTransferMoneyFromSrcUserToDstUserThenFirstUserHasLessMoney() {
        UserStorage stor = new UserStorage();

        stor.addUser(new User("Test", 100));
        stor.addUser(new User("Test", 100));

        stor.transferMoney(30, 0, 1);
        assertThat(stor.read(0).getAmount(), is(70));
    }

}