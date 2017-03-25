package kochetov.start;

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
     *  Ask number  in the range.
     * @param question - question
     * @param range - range
     * @return number
     */
    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range");
        }
    }



}
