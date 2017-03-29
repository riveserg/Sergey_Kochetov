package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;

/**
 * Bishop.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Bishop extends Figure {

    /**
     * Constructor.
     * @param position - position bishop
     */
    public Bishop(Cell position) {
        super(position);
        this.name = "Bishop";
    }

    /**
     * Constructor.
     * @param position - position
     * @param isWhiteColor -  bishop color
     */
    public Bishop(Cell position, boolean isWhiteColor) {
        super(position, isWhiteColor);
        this.name = "Bishop";
    }

    /**
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new Bishop(dist);
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
        if (Math.abs(this.position.getX() - dist.getX()) == Math.abs(this.position.getY() - dist.getY())) {
            result = super.way(dist);
        } else {
            throw new ImpossibleMoveException("The movement of the bishop is not possible");
        }
        return result;

    }
}
