package ua.com.webcamp.JavaAdv.Lesson07.Ex_04Synchronized;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */

/**
 * Thread-counter
 */
public class CounterThread extends Thread {

    /**
     * Counter
     */
    private Counter counter = null;


    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (counter) { // try without synchronized
                Main.log.info(String.format("Thread %s is running", Thread.currentThread().getName()));
                counter.add(i);
            }
        }
    }
}
