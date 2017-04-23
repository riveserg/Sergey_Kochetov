package kochetov;


/**
 * RaceCondition
 * Created by Сергей on 23.04.2017.
 */
public class RaceCondition {
    /**
     * Timer for visual test.
     */
    private final long TIMER = 2;
    /**
     * count.
     */
    private long count;
    /**
     * flag for visual test.
     */
    private volatile boolean flag = true;

    /**
     * Constructor.
     */
    public RaceCondition() {
        this.count = 0;
    }

    /**
     * Count increment.
     */
    public void incCount() {
        this.count++;
    }

    /**
     * Main method.
     */
    public void execute() {
        Thread thread1 = newThread();
        Thread thread2 = newThread();
        Thread thread3 = newThread();
        Thread threadTime = timePrintCount();

        threadTime.start();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();

        } catch (InterruptedException ignored) {}

        this.flag = false;
    }

    /**
     * Create increment Thread.
     * @return new thread.
     */
    private Thread newThread() {
        return new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000_000; i++) {
                    incCount();
                }
            }
        };
    }

    /**
     * Fun thread.
     * @return timer thread
     */
    private Thread timePrintCount() {
        return new Thread() {
            @Override
            public void run() {

                while (flag) {
                    System.out.println(count);
                    try {
                        Thread.sleep(TIMER);
                    } catch (InterruptedException ignored) {}

                }
                System.out.println("end count = " + count);
            }
        };
    }


}
