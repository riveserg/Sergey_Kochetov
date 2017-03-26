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

        if (!source.isExistsFigure()) {

            throw  new FigureNotFoundException("Figure not found");
        }
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
        if (moveFigure != null) {
            for (Cell cell : moveFigure) {
                if (!cell.isExistsFigure()) {
                    throw new OccupiedWayException("The cell occupied by another piece");
                }
            }
        } else {
            throw  new FigureNotFoundException("Figure not found");
        }

        this.figures[positionSource] = this.figures[positionSource].clone(dist);
        source.setFigure(false);

        return true;
    }
}
