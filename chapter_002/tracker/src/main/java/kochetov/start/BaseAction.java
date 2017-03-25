package ru.job4j.tracker;

/**
 * BaseAction.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public abstract class BaseAction implements UserAction {
    /**
     * Name.
     */
    private String name;

    /**
     * Constructor.
     * @param name - name
     */
    public BaseAction(String name) {
        this.name = name;
    }
}
