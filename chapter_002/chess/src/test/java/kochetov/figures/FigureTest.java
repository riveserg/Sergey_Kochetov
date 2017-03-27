package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Figure.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class FigureTest {
    /**
     *  Test Pawn move.
     */
    @Test
    public void whenPawnMoveCorrectlyThenPawnIsPathOfMotion() {
        Pawn pawn = new Pawn(new Cell(1, 1));
        Cell dist = new Cell(1, 3);
        Cell[] result = pawn.way(dist);
        Cell[] except = new Cell[] {new Cell(1, 2), new Cell(1, 3)};
        assertThat(result, is(except));
    }
    /**
     *  Test Queen move.
     */
    @Test
    public void whenQueenMoveCorrectlyThenQueenIsPathOfMotion() {
        Queen queen = new Queen(new Cell(0, 0));
        Cell dist = new Cell(3, 3);
        Cell[] result = queen.way(dist);
        Cell[] except = new Cell[] {new Cell(1, 1), new Cell(2, 2), new Cell(3, 3)};
        assertThat(result, is(except));
    }
    /**
     *  Test Bishop.
     */
    @Test
    public void whenBishopMoveCorrectlyThenBishopIsPathOfMotion() {
        Bishop bishop = new Bishop(new Cell(0, 0));
        Cell dist = new Cell(2, 2);
        Cell[] result = bishop.way(dist);

        Cell[] except = new Cell[] {new Cell(1, 1), new Cell(2, 2)};
        assertThat(result, is(result));
    }
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
     *  Test.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenBishopMoveCorrectlyThenPoppingUpTheException() {
        Bishop bishop = new Bishop(new Cell(0, 0));
        Cell dist = new Cell(7, 8);
        Cell[] result = bishop.way(dist);
        Cell[] except = {new Cell(1, 1), new Cell(2, 2)};
        assertThat(result, is(except));
    }

}
