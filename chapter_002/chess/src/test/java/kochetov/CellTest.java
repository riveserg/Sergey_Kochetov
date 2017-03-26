package kochetov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BCellTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class CellTest {
    /**
     *  Test Cell(not null) constructor().
     */
    @Test
    public void whenCreateCellThenToStringCell() {
        Cell cell = new Cell(0, 0);
        String result = String.format("%d %d", cell.getX(), cell.getY());
        String except = String.format("0 0");
        assertThat(result, is(except));
    }
}
