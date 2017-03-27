package kochetov.figures;

import kochetov.Cell;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BishopTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class BishopTest {
    /**
     *  Test Bishop constructor().
     */
    @Test
    public void whenCreateBishopThenToStringName() {
        Bishop bishop = new Bishop(new Cell(0, 0));
        String result = bishop.getName();
        String except = "Bishop";
        assertThat(result, is(except));
    }


}
