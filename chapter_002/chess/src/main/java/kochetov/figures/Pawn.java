package kochetov.figures;

import kochetov.Cell;
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
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new Pawn(dist);
    }

}
