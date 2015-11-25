package ua.com.webcamp.JavaAdv.Lesson07.Ex_09Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Artem Vereschaka on 8/24/15.
 * artem.andzen@gmail.com
 */
public class BarberQueue {
    /**
     * Lock
     */
    private final Lock queueLock = new ReentrantLock();
    /**
     * Serves concrete Person p
     * @param p Person
     */
    public void serve(Person p)
    {
        queueLock.lock();
        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName() +
                    ": serving a client during " + (duration/1000) + " seconds");
            Thread.sleep(duration);

            System.out.println("Client: " + p + " done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {

            queueLock.unlock();
        }
    }
}
