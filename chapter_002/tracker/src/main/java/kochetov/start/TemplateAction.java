package kochetov.start;

/**
 * TemplateAction.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public abstract class TemplateAction {
    /**
     * test.
     */
    abstract void start();
    /**
     * test.
     */
    abstract void finish();
    /**
     * test.
     */
    public void work() {
        this.start();
        this.finish();
    }
}
