package kochetov;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TriangleTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */


public class TriangleTest {
    /**
     *  line.separator.
      */
    private final String line = System.getProperty("line.separator");

    /**
     *  Test. Print in console Triangle.
      */
    @Test
    public void whenWeDrawATriangleThenItWritesToStream() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint paint = new Paint();
        paint.draw(new Triangle());
        final String result = String.format("xxxx%sxxx%sxx%sx", line, line, line);
        assertThat(out.toString(), is(result));
    }
}
