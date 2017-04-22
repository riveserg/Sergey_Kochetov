package kochetov;

/**
 * Created by Сергей on 22.04.2017.
 */
public class ThreadCountSpaces implements Runnable {
    private final String data;

    public ThreadCountSpaces(final String data) {
        this.data = data;
    }

    @Override
    public void run() {
        int countSpaces = 0;
        for (char ch : this.data.toCharArray()) {
            if (ch == '\u0020') {
                countSpaces++;
                System.out.println("countSpaces= " + countSpaces);
            }
        }
    }
}
