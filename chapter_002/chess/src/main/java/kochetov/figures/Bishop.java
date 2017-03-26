package kochetov.figures;

import kochetov.Cell;

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
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new Bishop(dist);
    }

}