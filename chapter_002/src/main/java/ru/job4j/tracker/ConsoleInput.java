package ru.job4j.tracker;

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




    @Override
    public void close() throws IOException {
        scanner.close();
    }
}
