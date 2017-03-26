package kochetov.figures;

import kochetov.Cell;

/**
 * Created by Сергей on 26.03.2017.
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

    @Override
    public Figure clone(Cell dist) {
        return new King(dist);
    }
}
