package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;

/**
 * Rook.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Rook extends Figure {
    /**
     * Constructor.
     *
     * @param position - position
     */
    public Rook(Cell position) {
        super(position);
        this.name = "Rook";
    }

    /**
     * Constructor.
     * @param position - position
     * @param isWhiteColor - Rook color
     */
    public Rook(Cell position, boolean isWhiteColor) {
        super(position, isWhiteColor);
    }

    /**
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new Rook(dist);
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
        if((this.position.getX() == dist.getX()) || (this.position.getY() == dist.getY())) {
            result = super.way(dist);
        } else {
            throw new ImpossibleMoveException("The movement of the rook is not possible");
        }
        return result;
    }
}
