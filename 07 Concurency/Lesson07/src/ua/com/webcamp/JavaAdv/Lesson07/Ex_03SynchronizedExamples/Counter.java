package ua.com.webcamp.JavaAdv.Lesson07.Ex_03SynchronizedExamples;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */
public class Counter {
    /**
     * Count
     */
    protected long count = 0;

    /**
     * Adds value to internal count. SYNCHRONIZED
     * @param value value to add
     */
    public synchronized void add(long value) {
        count += value;
    }

    /**
     * Gets internal count
     * @return count
     */
    public long getCount() {
        return count;
    }

    public static synchronized void doStuff(long value)
    {
        // do
        // some
        // stuff
    }

    public void doStuff2(long value)
    {
        synchronized (this){
            count+=value;
            // other stuff
        }
    }

    public static void doStuff3(long value)
    {
        synchronized (Counter.class){
            // do
            // some
            // stuff
        }
    }

}
