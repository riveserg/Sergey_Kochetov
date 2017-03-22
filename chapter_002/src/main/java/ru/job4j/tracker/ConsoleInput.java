package ru.job4j.tracker;

import java.util.Scanner;
/**
 * ConsoleInput.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class ConsoleInput implements Input {
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

    /** Print.
     *  print the user menu Tracker
     * @param data
     */
    @Override
    public void print(String data) {
        /*
        if (data.equals("Print menu")) {
            String[] textMenu = {"0. Add new Item", "1. Show all items",
                    "2. Edit item", "3. Delete item", "4. Find item by Id",
                    "5. Find items by name", "5. Find items by name", "6. Exit Program", "Select: "};
            for (String text : textMenu) {
                System.out.println(text);

            }
        }
        */
    }


}
