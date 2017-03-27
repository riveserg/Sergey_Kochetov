package kochetov.figures;

import kochetov.Cell;
/**
 * Queen.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Queen extends Figure {
    /**
     * Constructor.
     *
     * @param position - position
     */
    public Queen(Cell position) {
        super(position);
        this.name = "Queen";
    }

    /**
     * Constructor.
     * @param position - position
     * @param isWhiteColor - Queen color
     */
    public Queen(Cell position, boolean isWhiteColor) {
        super(position, isWhiteColor);
    }

    /**
     *  Clone.
     * @param dist - position figure
     * @return clone figure
     */
    @Override
    public Figure clone(Cell dist) {
        return new Queen(dist);
    }
}
