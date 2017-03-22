package ru.job4j.tracker;

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
     *  Print.
     * @param data - data
     */
    void print(String data);

}
