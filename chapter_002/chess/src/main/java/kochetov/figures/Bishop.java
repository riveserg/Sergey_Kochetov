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
     * An array of traversed cells.
     * @param dist - cell where is the figure
     * @return cell where is the figure
     * @throws ImpossibleMoveException - RuntimeException
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        int cellBoardX = this.position.getX();
        int cellBoardY = this.position.getY();
        int motionModuleX =(cellBoardX - dist.getX());
        int motionModuleY = (cellBoardY - dist.getY());
        if ( Math.abs(motionModuleX) != Math.abs(motionModuleY)) {
            throw new ImpossibleMoveException("The movement of the figures is not possible");
        }
        Cell[] result = new Cell[Math.abs(motionModuleX)];
        int countCell = 0;

        do {
            if (motionModuleX < 0) {
                cellBoardX++;
            } else {
                cellBoardX--;
            }
            if (motionModuleY < 0) {
                cellBoardY++;
            } else {
                cellBoardY--;
            }
            result[countCell++] = new Cell(cellBoardX, cellBoardY);
        } while (countCell != Math.abs(motionModuleX));
        return result;
    }

    /**
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return (Bishop) new Bishop(dist);
    }

}
