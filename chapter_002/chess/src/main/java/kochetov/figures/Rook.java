package kochetov.figures;

import kochetov.Cell;
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
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new Rook(dist);
    }
}
