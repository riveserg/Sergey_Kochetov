package kochetov;

/**
 * OccupiedWayException.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class OccupiedWayException extends RuntimeException {
    /**
     * OccupiedWayException.
     * @param message - msg
     */
    public OccupiedWayException(String message) {
        super(message);
    }
}
