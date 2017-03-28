package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Сергей on 28.03.2017.
 */
public class KingTest {


    /**
     *  Test.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenKingMoveIncorrectlyThenPoppingUpTheException() {
        King king = new King(new Cell(0, 0));
        Cell dist = new Cell(5, 7);
        Cell[] result = king.way(dist);
    }
    /**
     *  Test King move.
     */
    @Test
    public void whenKingMoveCorrectlyThenKingIsPathOfMotion() {
        Pawn pawn = new Pawn(new Cell(7, 7));
        Cell dist = new Cell(7, 6);
        Cell[] result = pawn.way(dist);
        Cell[] except = new Cell[] {new Cell(7, 6)};
        assertThat(result, is(except));
    }
}
