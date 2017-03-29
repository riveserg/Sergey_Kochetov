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
        Cell[] result = null;
        if (((this.position.getY() == 1 && this.isWhiteColor) ||
                (this.position.getY() == 6 && !this.isWhiteColor)) &&
                this.position.getX() == dist.getX() && Math.abs(this.position.getY() - dist.getY()) <= 2) {
                result = super.way(dist);
        } else if(this.position.getX() == dist.getX() && Math.abs(this.position.getY() - dist.getY()) == 1) {
            result = super.way(dist);
        } else {
            throw new ImpossibleMoveException("The movement of the pawn is not possible");
        }
        return result;
    }

}
