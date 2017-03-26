package kochetov.figures;

import kochetov.Cell;

/**
 * Created by Сергей on 26.03.2017.
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

    @Override
    public Figure clone(Cell dist) {
        return new Rook(dist);
    }
}
