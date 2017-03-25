package kochetov.start;

/**
 * interface Input.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public interface Input {
    /**
     *  Ask.
     * @param question - question
     * @return tag
     */
    String ask(String question);

    /**
     *  Ask.
     * @param question - question
     * @param range - range
     * @return number menu
     * @throws MenuOutException - Menu exception
     */
    int ask(String question, int[] range) throws MenuOutException;

}
