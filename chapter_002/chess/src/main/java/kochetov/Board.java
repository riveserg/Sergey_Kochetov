package kochetov;

import kochetov.figures.Figure;
/**
 * Board.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Board {

    /**
     * Figures on the board.
     */
    private Figure[] figures;

    /**
     * Constructor board.
     * @param figures - figure
     */
    public Board(Figure[] figures) {
        this.figures = figures;

    }

    /**
     * Getter.
     * @return figure array
     */
    public Figure[] getFigures() {
        return this.figures;
    }

    /**
     *  Method returns whether the movement of the figure.
     * @param source - where is the figure
     * @param dist - where will figure
     * @return the result of the movement
     * @throws ImpossibleMoveException - RuntimeException
     * @throws OccupiedWayException - RuntimeException
     * @throws FigureNotFoundException - RuntimeException
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {

        Cell[] moveFigure = null;
        int positionSource = -1;
        for (int i = 0; i < this.figures.length; i++) {
            if ((this.figures[i].getPosition().getX() == source.getX()) &&
                    ((this.figures[i].getPosition().getY() == source.getY()))) {

               // if the movement is not possible throws ImpossibleMoveException
               moveFigure = this.figures[i].way(dist);
               positionSource = i;
            }
        }
        if (positionSource == -1) {
            throw  new FigureNotFoundException("Figure not found");
        }
        if (!canMovement(moveFigure)) {
            throw new OccupiedWayException("The cell occupied by another piece");
        }
        this.figures[positionSource] = this.figures[positionSource].clone(dist);
        return true;
    }

    /**
     *  On the path there are obstacles?
     * @param cells - array cells
     * @return - result
     */
    boolean canMovement(Cell[] cells) {
        boolean result = true;
        if (cells != null) {
            for (Cell cell : cells) {
                for (Figure figure : this.figures) {
                    if (cell.getX() == figure.getPosition().getX() && cell.getY() == figure.getPosition().getY()) {
                       result = false;
                    }
                }
            }
        } else {
            throw new NullPointerException("Not valid data");
        }
        return result;
    }

    boolean walk(Figure figure) {

        return true;
    }



}
