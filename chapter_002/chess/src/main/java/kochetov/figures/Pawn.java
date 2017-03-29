package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;

/**
 * Pawn.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Pawn extends Figure {
    /**
     * Constructor.
     *
     * @param position - position
     */
    public Pawn(Cell position) {
        super(position);
        this.name = "Pawn";
    }

    /**
     * Constructor.
     * @param position - position
     * @param isWhiteColor - pawn color
     */
    public Pawn(Cell position, boolean isWhiteColor) {
        super(position, isWhiteColor);
        this.name = "Pawn";
    }

    /**
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new Pawn(dist);
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
