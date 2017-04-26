package kochetov.count;

/**
 * Count.
 * Created by Сергей on 26.04.2017.
 */
public class Count {
    /**
     * Field to increment.
     */
    private int value;

    private final Object lock = new Object();

    /**
     * Constructor.
     */
    public Count() {
        this.value = 0;
    }

    /**
     * Increment value.
     */
    public void increment() {
        synchronized (this.lock) {
            this.value++;
        }
    }

    /**
     * Getter.
     * @return value
     */
    public int getValue() {
        synchronized (this.lock){
            return this.value;
        }
    }

    /**
     * Main method.
     */
    public void execute() {
        Thread thread1 = newThread();
        Thread thread2 = newThread();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getValue());

    }

    /**
     * New thread.
     * @return thread for increment
     */
    private Thread newThread() {
        return new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
               increment();
            }
        });
    }

}
