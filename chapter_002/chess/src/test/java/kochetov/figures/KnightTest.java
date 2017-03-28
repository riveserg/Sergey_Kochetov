package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * KnightTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class KnightTest {
    /**
     *  Test Knight.
     */
    @Test
    public void whenKnightMoveCorrectlyThenKnightIsPathOfMotion() {
        Knight knight = new Knight(new Cell(1, 1));
        Cell dist = new Cell(3, 2);
        Cell[] result = knight.way(dist);
        Cell[] except = new Cell[] {new Cell(3, 2)};
        assertThat(result, is(result));
    }
    /**
     *  Test Knight.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenKnightMoveIncorrectlyThenPoppingUpTheException() {
        Knight knight = new Knight(new Cell(1, 1));
        Cell dist = new Cell(3, 3);
        Cell[] result = knight.way(dist);
    }

}
