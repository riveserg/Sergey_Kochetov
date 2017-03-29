package kochetov;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MoneyTest
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class MoneyTest {
    /**
     *  line.separator.
     */
    private final String line = System.getProperty("line.separator");
    /**
     *  Test. Print in console.
     */
    @Test
    public void whenThen() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Money coins = new Money(new int[] {1, 2, 5});
        coins.getCountOfWays(5);
        final String result = String.format("11111%s1112%s122%s5%s", line, line, line, line);
        assertThat(out.toString(), is(result));
        out.close();
    }

}
