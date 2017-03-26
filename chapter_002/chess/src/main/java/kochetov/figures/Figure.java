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

    /**
     *  Constructor.
     * @param position - position
     */
    Figure(Cell position) {
        this.position = position;
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
    public abstract Cell[] way(Cell dist) throws ImpossibleMoveException;

    /**
     * Clone figure.
     * @param dist - position figure
     * @return - figure
     */
    public abstract Figure clone(Cell dist);

}
