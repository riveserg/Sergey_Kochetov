package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;

/**
 * Queen.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Queen extends Figure {
    /**
     * Constructor.
     *
     * @param position - position
     */
    public Queen(Cell position) {
        super(position);
        this.name = "Queen";
    }

    /**
     * Constructor.
     * @param position - position
     * @param isWhiteColor - Queen color
     */
    public Queen(Cell position, boolean isWhiteColor) {
        super(position, isWhiteColor);
    }

    /**
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new Queen(dist);
    }

    /**
     * An array of traversed cells.
     * @param dist - cell where is the figure
     * @return array cells
     * @throws ImpossibleMoveException - exception
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        return super.way(dist);
    }
}
