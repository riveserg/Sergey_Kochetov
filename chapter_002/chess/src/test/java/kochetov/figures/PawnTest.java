package kochetov.figures;

import kochetov.Cell;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PawnTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class PawnTest {
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

}
