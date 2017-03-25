package kochetov.start;

/**
 * UserAction.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public interface UserAction {
    /**
     *  Key operation.
     * @return key
     */
    int key();

    /**
     *  Execute.
     * @param input - input
     * @param tracker - tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     *  Information about the operation.
     * @return tag
     */
    String info();
}
