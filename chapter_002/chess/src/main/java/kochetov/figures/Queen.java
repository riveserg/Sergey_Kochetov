package kochetov.figures;

import kochetov.Cell;

/**
 * Created by Сергей on 26.03.2017.
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

    @Override
    public Figure clone(Cell dist) {
        return new Queen(dist);
    }
}
