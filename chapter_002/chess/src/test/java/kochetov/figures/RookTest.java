package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * RookTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class RookTest {
    /**
     *  Test Rook.
     */
    @Test
    public void whenRookMoveCorrectlyThenRookIsPathOfMotion() {
        Rook rook = new Rook(new Cell(1, 1));
        Cell dist = new Cell(1, 4);
        Cell[] result = rook.way(dist);
        Cell[] except = new Cell[] {new Cell(1, 2),new Cell(1, 3),new Cell(1, 4)};
        assertThat(result, is(result));
    }
    /**
     *  Test Knight.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenRookMoveIncorrectlyThenPoppingUpTheException() {
        Rook rook = new Rook(new Cell(1, 1));
        Cell dist = new Cell(2, 4);
        Cell[] result = rook.way(dist);
    }

}
