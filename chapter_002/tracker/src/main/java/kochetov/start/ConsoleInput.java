package kochetov.start;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;
/**
 * ConsoleInput.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class ConsoleInput implements Input, Closeable {
    /**
     * Scanner to read lines of user input.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     *  Ask user.
     * @param question - question
     * @return tag
     */
    @Override
    public String ask(String question) {
            System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Ask user number in the range.
     * @param question - question
     * @param range - range
     * @return number
     */
    @Override
    public int ask(String question, int[] range) throws MenuOutException {
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
            throw new MenuOutException("Out of menu range.");
        }

    }


    @Override
    public void close() throws IOException {
        scanner.close();
    }
}
