package kochetov;

/**
 * ThreadCountSpaces.
 * Created by Сергей on 22.04.2017.
 */
public class ThreadCountSpaces implements Runnable {
    /**
     * Text data.
     */
    private final String data;

    /**
     * Constructor.
     * @param data - text
     */
    public ThreadCountSpaces(final String data) {
        this.data = data;
    }

    /**
     * Method run.
     */
    @Override
    public void run() {
        int countSpaces = 0;
        for (char ch : this.data.toCharArray()) {
            if (ch == '\u0020') {
                countSpaces++;
            }
        }
        System.out.println(String.format("Spaces: %s", countSpaces));
    }
}
