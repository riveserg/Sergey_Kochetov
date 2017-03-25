package kochetov;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * SquareTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class SquareTest {
    /**
     *  line.separator.
     */
    private final String line = System.getProperty("line.separator");

    /**
     *  Test. Print in console Square.
     */
    @Test
    public void whenWeDrawASquareThenItWritesToStream() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint paint = new Paint();
        paint.draw(new Square());
        final String result = String.format("xxxx%sxxxx%sxxxx%sxxxx", line, line, line);
        assertThat(out.toString(), is(result));
    }
}
