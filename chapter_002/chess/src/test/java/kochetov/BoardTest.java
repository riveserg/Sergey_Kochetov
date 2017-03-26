package kochetov;

import kochetov.figures.Bishop;
import kochetov.figures.Figure;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * BoardTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    /**
     * Test.
     */
    @Test(expected = FigureNotFoundException.class)
    public void whenTheFigureIsNotInACageThenUpNewException() {
        Bishop bishop = new Bishop(new Cell(0, 0));
        Board board = new Board(new Figure[]{bishop});
        board.move(new Cell(1, 1), new Cell(3, 3));
    }
    /**
     * Test.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenMovingFigureAroundTheBoardThenItObstacle() {
        Bishop bishop = new Bishop(new Cell(0, 0));
        Bishop bishopTwo = new Bishop(new Cell(1, 1));
        Board board = new Board(new Figure[]{bishop, bishopTwo});

        board.move(new Cell(0, 0, true), new Cell(3, 3));
    }

    /**
     * Test
     */
    @Test
    public void whenMovingTestThenOk(){
        Bishop bishop = new Bishop(new Cell(1,1, true));
        Bishop bishopTwo = new Bishop(new Cell(6,6, true));

        Board board = new Board(new Figure[]{bishop, bishopTwo});
        boolean fig = board.move(new Cell(1,1, true), new Cell(5, 5));
        String result = String.format("%d %d", 5, 5);
        String expected = String.format("%d %d", board.getFigures()[0].getPosition().getX(), board.getFigures()[0].getPosition().getY());

        assertThat(result, is(expected));
    }
}
