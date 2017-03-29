package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;
/**
 * Knight.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Knight extends Figure {
    /**
     * Constructor.
     *
     * @param position - position
     */
    public Knight(Cell position) {
        super(position);
        this.name = "Knight";
    }

    /**
     *  Constructor.
     * @param position - position
     * @param isWhiteColor - Knight color
     */
    public Knight(Cell position, boolean isWhiteColor) {
        super(position, isWhiteColor);
        this.name = "Knight";
    }

    /**
     *  An of traversed cells.
     * @param dist - cell where is the figure
     * @return cell
     * @throws ImpossibleMoveException - RuntimeException
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] result = new Cell[1];
        int moduleX = Math.abs(this.position.getX() - dist.getX());
        int moduleY = Math.abs(this.position.getY() - dist.getY());
        if ((moduleX == 1 && moduleY == 2) || (moduleX == 2 && moduleY == 1)) {
            result[0] = dist;
        } else {
            throw new ImpossibleMoveException("The movement of the knight is not possible");
        }
        return result;
    }
    /**
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new Knight(dist);
    }

}
