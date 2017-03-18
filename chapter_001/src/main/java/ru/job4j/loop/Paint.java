package ru.job4j.loop;

/**
 * Paint.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     *  Method draw a pyramid from the symbol "^" height h.
     * @param h - height
     * @return result string
     */
    public String piramid(int h) {
        StringBuilder stringBuilder = new StringBuilder();
        if (h < 1) {
            return "";
        }
        for (int i = 0; i < h; i++) {
            stringBuilder.append(addSpaces(h - 1 - i));
            for (int j = 0; j < 1 + 2 * i; j++) {
                stringBuilder.append("^");
            }
            stringBuilder.append(addSpaces(h - 1 - i));
            if (i != h - 1) {
                stringBuilder.append(System.getProperty("line.separator"));
            }

        }
        return stringBuilder.toString();
    }

    /**
     * Method returns n spaces.
     * @param n - spaces
     * @return result string
     */
    public String addSpaces(int n) {
        StringBuilder resultString = new StringBuilder();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                resultString.append(" ");
            }
        }
        return resultString.toString();
    }

}
