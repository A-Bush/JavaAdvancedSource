package ua.com.webcamp.JavaAdv.Lesson07.Ex_02RaceCondition;

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
     * Adds value to internal count
     * @param value value to add
     */
    public void add(long value) {
        count += value;
    }

    /**
     * Gets internal count
     * @return count
     */
    public long getCount() {
        return count;
    }
}
