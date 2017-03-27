package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;

/**
 * Figure.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public abstract class Figure {
    /**
     * Position ob the board.
     */
    final Cell position;
    /**
     * Name figure.
     */
    String name;



    final boolean isWhiteColor;

    /**
     *  Constructor.
     * @param position - position
     */
    public Figure(Cell position) {
        this.position = position;
        this.isWhiteColor = true;
    }

    /**
     *  Constructor.
     * @param position - position
     * @param isWhiteColor - color figure
     */
    public Figure(Cell position, boolean isWhiteColor) {
        this.position = position;
        this.isWhiteColor = isWhiteColor;
    }

    /**
     * Getter
     * @return - position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * Getter name.
     * @return name
     */
    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "Figure";
        }
    }

    /**
     *  An array of traversed cells.
     * @param dist - cell where is the figure
     * @return array cells
     * @throws ImpossibleMoveException - RuntimeException
     */
    public Cell[] way(Cell dist) throws ImpossibleMoveException{
        int srcX = this.position.getX();
        int srcY = this.position.getY();
        int moduleX =(srcX - dist.getX());
        int moduleY = (srcY - dist.getY());
        int cellLength = Math.abs(Math.abs(moduleX) > Math.abs(moduleY) ? Math.abs(moduleX) : Math.abs(moduleY));
        Cell[] result = new Cell[cellLength];
        int countCell = 0;
        do {
            if (moduleX < 0) {
                srcX++;
            } else if (moduleX > 0){
                srcX--;
            }
            if (moduleY < 0) {
                srcY++;
            } else if (moduleY > 0){
                srcY--;
            }
            result[countCell++] = new Cell(srcX, srcY);
        } while (countCell != cellLength);

        if (result[result.length - 1].getX()!=dist.getX() || result[result.length - 1].getY() != dist.getY()) {
            throw new ImpossibleMoveException("The movement of the figures is not possible");

        }
        return result;
    }

    /**
     * Clone figure.
     * @param dist - position figure
     * @return - figure
     */
    public abstract Figure clone(Cell dist);


}
