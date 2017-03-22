package ru.job4j.tracker;

/**
 * StubInput.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class StubInput implements Input {
    /**
     * user answers.
     */
    private String[] answers;
    /**
     *  Position on array answers.
     */
    private int position = 0;

    /**
     * Default.
     * @param answers - answer
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     *  Ask.
     * @param question - question
     * @return tag
     */
    @Override
    public String ask(String question) {
        return answers[position++];
    }

    /**
     * Print.
     * @param data - data
     */
    @Override
    public void print(String data) {

    }
}
