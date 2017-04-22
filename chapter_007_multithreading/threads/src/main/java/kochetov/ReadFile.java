package kochetov;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ReadFile.
 * Created by Сергей on 20.04.2017.
 */
public class ReadFile {
    /**
     * Text data.
     */
    private final String data;

    /**
     * Constructor.
     * @param data - text
     */
    public ReadFile(String data) {
        this.data = data;
    }

    /**
     * Main method.
     */
    public void main(){
        System.out.println("Start");

        ThreadCountWord countWord = new ThreadCountWord(this.data);
        ThreadCountSpaces countSpaces = new ThreadCountSpaces(this.data);

        Thread thread1 = new Thread(countSpaces);
        Thread thread2 = new Thread(countWord);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(thread1);
        executorService.submit(thread2);

        try {
            if (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");

    }

}
