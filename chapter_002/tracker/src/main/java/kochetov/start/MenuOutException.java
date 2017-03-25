package ru.job4j.tracker;
/**
 * MenuOutException.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class MenuOutException extends RuntimeException {
    /**
     * Constructor.
     * @param msg - message
     */
    public MenuOutException(String msg) {
        super(msg);
    }
}
