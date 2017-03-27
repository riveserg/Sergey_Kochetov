package kochetov.figures;

import kochetov.Cell;
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
}
