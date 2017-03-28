package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * QueenTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class QueenTest {
    /**
     *  Test Queen.
     */
    @Test
    public void whenQueenMoveCorrectlyThenQueenIsPathOfMotion() {
        Queen queen= new Queen(new Cell(1, 1));
        Cell dist = new Cell(1, 4);
        Cell[] result = queen.way(dist);
        Cell[] except = new Cell[] {new Cell(1, 2),new Cell(1, 3),new Cell(1, 4)};
        assertThat(result, is(result));
    }
    /**
     *  Test Queen move.
     */
    @Test
    public void whenQueenTwoMoveCorrectlyThenQueenIsPathOfMotion() {
        Queen queen = new Queen(new Cell(0, 0));
        Cell dist = new Cell(3, 3);
        Cell[] result = queen.way(dist);
        Cell[] except = new Cell[] {new Cell(1, 1), new Cell(2, 2), new Cell(3, 3)};
        assertThat(result, is(except));
    }
    /**
     *  Test Queen.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenQueenMoveIncorrectlyThenPoppingUpTheException() {
        Queen queen = new Queen(new Cell(1, 1));
        Cell dist = new Cell(6, 7);
        Cell[] result = queen.way(dist);
    }

}
