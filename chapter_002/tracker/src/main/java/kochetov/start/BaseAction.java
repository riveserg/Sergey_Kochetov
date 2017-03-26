package kochetov.start;

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
     * Key operation.
     */
    private int key;



    /**
     * Constructor.
     * @param name - name
     * @param key - key
     */
    public BaseAction(String name, int key) {
        this.name = name;
        this.key = key;
    }

    /**
     * Execute.
     * @param input - input
     * @param tracker - tracker
     */
    public abstract void execute(Input input, Tracker tracker);

    /**
     * Information about the operation.
     * @return
     */
    @Override
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }


}
