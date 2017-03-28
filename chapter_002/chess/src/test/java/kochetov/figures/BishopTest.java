package kochetov.figures;

import kochetov.Cell;

import kochetov.ImpossibleMoveException;
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
