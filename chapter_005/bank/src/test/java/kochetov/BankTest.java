package kochetov;

import kochetov.model.User;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Сергей on 04.04.2017.
 */
public class BankTest {
    /**
     * Test.
     */
    @Test
    public void whenTheBankWasAMaxOfNineUsersThenIsOk() throws InterruptedException {
        Bank bank = new Bank();
        bank.enterBank(new User("name1", "1"));
        Thread.sleep(1000);
        bank.enterBank(new User("name2", "2"));
        Thread.sleep(1000);
        bank.enterBank(new User("name22", "22"));
        Thread.sleep(1000);
        bank.enterBank(new User("name3", "3"));
        Thread.sleep(1000);
        bank.enterBank(new User("name4", "4"));
        Thread.sleep(1000);
        bank.exitBank(new User("name1", "1"));
        Thread.sleep(1000);
        bank.exitBank(new User("name2", "2"));
        Thread.sleep(1000);
        bank.enterBank(new User("name44", "44"));
        Thread.sleep(1000);
        bank.enterBank(new User("name4444", "4444"));
        Thread.sleep(1000);
        bank.enterBank(new User("name5", "5"));
        Thread.sleep(1000);
        bank.enterBank(new User("name6", "6"));
        Thread.sleep(1000);
        bank.enterBank(new User("name7", "7"));
        Thread.sleep(1000);
        bank.enterBank(new User("name8", "8"));
        Thread.sleep(1000);
        bank.exitBank(new User("name7", "7"));
        Thread.sleep(1000);
        bank.exitBank(new User("name8", "8"));
        Thread.sleep(1000);
        bank.exitBank(new User("name6", "6"));
        Thread.sleep(1000);
        bank.exitBank(new User("name5", "5"));
        Thread.sleep(1000);

        String tmp = bank.periodOfMaxAttendance();
        final String result = tmp.substring(tmp.length() - 1);
        final String expected = "9";
        assertThat(result, is(expected));
    }
}
