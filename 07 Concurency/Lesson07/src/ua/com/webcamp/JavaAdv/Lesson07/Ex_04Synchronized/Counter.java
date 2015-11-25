package ua.com.webcamp.JavaAdv.Lesson07.Ex_04Synchronized;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents synchronized counter
 */
public class Counter {
    /**
     * Counter
     */
    private long count = 0;

    /**
     * Adds value to the internal counter
     * @param value value to add
     */
    public synchronized void add(long value)
    {
        count+=value;
    }

    /**
     * Gets internal count
     * @return count
     */
    public long getCount() {
        return count;
    }
}
