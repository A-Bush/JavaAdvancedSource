package ua.com.webcamp.JavaAdv.Lesson07.Ex_08Lock;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Thread-counter
 */
public class CounterThread extends Thread {

    /**
     * Counter
     */
    private Counter counter = null;
    private Lock lock = new ReentrantLock();

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            Main.log.info(String.format("Thread %s is running", Thread.currentThread().getName()));
            counter.add(i);

        }
    }
}
