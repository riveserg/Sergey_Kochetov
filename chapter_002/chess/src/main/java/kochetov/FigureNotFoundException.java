package kochetov;

/**
 * FigureNotFoundException.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class FigureNotFoundException extends RuntimeException {
    /**
     * FigureNotFoundException.
     * @param message - msg
     */
    public FigureNotFoundException(String message) {
        super(message);
    }
}
