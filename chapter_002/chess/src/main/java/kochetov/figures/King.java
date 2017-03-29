package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;

/**
 * King.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class King extends Figure {
    /**
     * Constructor.
     *
     * @param position - position
     */
    public King(Cell position) {
        super(position);
        this.name = "King";
    }

    /**
     * Constructor.
     * @param position - position
     * @param isWhiteColor - color King
     */
    public King(Cell position, boolean isWhiteColor) {
        super(position, isWhiteColor);
        this.name = "King";
    }

    /**
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new King(dist);
    }

    /**
     * An array of traversed cells.
     * @param dist - cell where is the figure
     * @return array cells
     * @throws ImpossibleMoveException - exception
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] result = null;
        if((Math.abs(this.position.getX() - dist.getX()) <= 1) && (Math.abs(this.position.getY() - dist.getY()) <= 1)) {
            result = super.way(dist);
        } else {
            throw new ImpossibleMoveException("The movement of the king is not possible");
        }
        return result;

    }
}
