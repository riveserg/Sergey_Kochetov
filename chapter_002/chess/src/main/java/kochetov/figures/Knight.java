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
     *  An of traversed cells.
     * @param dist - cell where is the figure
     * @return cell
     * @throws ImpossibleMoveException - RuntimeException
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] result = new Cell[1];
        if (((this.position.getX() == dist.getX() - 2) && ((this.position.getY() == dist.getY() + 1) || (this.position.getY() == dist.getY() - 1))) ||
                ((this.position.getX() == dist.getX() - 1) && ((this.position.getY() == dist.getY() + 2) || (this.position.getY() == dist.getY() - 2))) ||
                ((this.position.getX() == dist.getX() + 1) && ((this.position.getY() == dist.getY() + 2) || (this.position.getY() == dist.getY() - 2))) ||
                ((this.position.getX() == dist.getX() + 2) && ((this.position.getY() == dist.getY() + 1) || (this.position.getY() == dist.getY() - 1)))) {
            result[1] = dist;
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
