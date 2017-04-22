package kochetov;

/**
 * ThreadCountWord.
 * Created by Сергей on 22.04.2017.
 */
public class ThreadCountWord implements Runnable {
    /**
     * Text data.
     */
    private final String data;

    /**
     * Constructor.
     * @param data - text
     */
    public ThreadCountWord(final String data) {
        this.data = data;
    }
    /**
     * Method run.
     */
    @Override
    public void run() {
        int countWord = 0;
        for (String str : this.data.split(" ")){
            countWord++;
        }
        System.out.println(String.format("Words: %s", countWord));

    }


}
