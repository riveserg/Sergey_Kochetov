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
     *  Execute.
     * @param input - input
     * @param tracker - tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     * Info.
     * @return info tag.
     */
    String info();
}
