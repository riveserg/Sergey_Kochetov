package kochetov.figures;

import kochetov.Cell;
import kochetov.ImpossibleMoveException;

/**
 * Figure.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Figure {
    /**
     * Position ob the board.
     */
    final Cell position;
    /**
     * Name figure.
     */
    String name;

    /**
     *  Constructor.
     * @param position - position
     */
    Figure(Cell position) {
        this.position = position;
    }

    /**
     * Getter
     * @return - position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * Getter name.
     * @return name
     */
    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "Figure";
        }

    }

    /**
     *  An array of traversed cells.
     * @param dist - cell where is the figure
     * @return array cells
     * @throws ImpossibleMoveException - RuntimeException
     */
    public Cell[] way(Cell dist) throws ImpossibleMoveException{
        int srcX = this.position.getX();
        int srcY = this.position.getY();
        int moduleX =(srcX - dist.getX());
        int moduleY = (srcY - dist.getY());
        int cellLength = Math.abs(Math.abs(moduleX) > Math.abs(moduleY) ? Math.abs(moduleX) : Math.abs(moduleY));
        Cell[] result = new Cell[cellLength];
        int countCell = 0;
        do {
            if (moduleX < 0) {
                srcX++;
            } else if (moduleX > 0){
                srcX--;
            }
            if (moduleY < 0) {
                srcY++;
            } else if (moduleY > 0){
                srcY--;
            }
            result[countCell++] = new Cell(srcX, srcY);
        } while (countCell != cellLength);

        if (result[result.length-1].getX()!=dist.getX() || result[result.length-1].getY()!=dist.getY()) {
            throw new ImpossibleMoveException("The movement of the figures is not possible");

        }
        return result;
    }

    /**
     * Clone figure.
     * @param dist - position figure
     * @return - figure
     */
    public Figure clone(Cell dist){ return null;}

    public void echo(Cell[] cells) {
        for (Cell cell : cells) {
            System.out.print("{x="+cell.getX()+" y="+cell.getY()+"}");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Figure figure = new Figure(new Cell(1,1, true));
        Cell[] fig = figure.way(new Cell(1,5));
        System.out.println(fig.length);
        figure.echo(fig);

    }
}
