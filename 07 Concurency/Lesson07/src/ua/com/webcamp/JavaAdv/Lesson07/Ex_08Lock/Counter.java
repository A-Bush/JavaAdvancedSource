package ua.com.webcamp.JavaAdv.Lesson07.Ex_08Lock;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Represents synchronized counter
 */
public class Counter {
    /**
     * Counter
     */
    private long count = 0;

    /**
     * Lock
     */
    private Lock lock = new ReentrantLock();

    /**
     * Adds value to the internal counter
     * @param value value to add
     */
    public void add(long value)
    {
        lock.lock();

        count+=value;

        lock.unlock(); // try to comment
    }

    /**
     * Gets internal count
     * @return count
     */
    public long getCount() {
        return count;
    }
}
