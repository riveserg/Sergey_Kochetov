package kochetov;

/**
 * Cell.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Cell {
    /**
     * Figure.
     */
    private boolean existsFigure;
    /**
     * the x coordinate.
     */
    private int x;
    /**
     * the y coordinate.
     */
    private int y;

    /**
     *  Constructor.
     * @param x - x coordinate
     * @param y - y coordinate
     */
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.existsFigure = false;
    }

    /**
     * Constructor.
     * @param x - x coordinate
     * @param y - y coordinate
     * @param figure - figure
     */
    public Cell( int x, int y, boolean figure) {
        this.x = x;
        this.y = y;
        this.existsFigure = figure;
    }

    /**
     * Setter.
     * @param figure - figure
     */
    public void setFigure(boolean figure) {
        this.existsFigure = figure;
    }


    /**
     *  Figure exist?
     * @return result
     */
    public boolean isExistsFigure() {
        return this.existsFigure;
    }

    /**
     * Getter.
     * @return - position x
     */
    public int getX() {
        return x;
    }

    /**
     * Getter.
     * @return - position y
     */
    public int getY() {
        return y;
    }

    /**
     * Cell toString.
     * @return - tag
     */
    @Override
    public String toString() {
        String result = String.format("Cell{x=%d, y=%d}", getX(), getY());
        return result;
    }
}
