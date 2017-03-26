package kochetov.figures;

import kochetov.Cell;

/**
 * Created by Сергей on 26.03.2017.
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

    @Override
    public Figure clone(Cell dist) {
        return new Pawn(dist);
    }

    public static void main(String[] args) {
        System.out.println( "4/2=" + 4/2 == "4/2=2");
    }
}
