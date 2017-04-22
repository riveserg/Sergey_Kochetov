package kochetov;

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

        ThreadCountWord countWord = new ThreadCountWord(this.data);
        ThreadCountSpaces countSpaces = new ThreadCountSpaces(this.data);

        Thread thread1 = new Thread(countSpaces);
        Thread thread2 = new Thread(countWord);


        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }


    }

}
