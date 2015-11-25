package ua.com.webcamp.JavaAdv.Lesson08.Ex_02Lambdas;

import java.util.Comparator;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */

/**
 * My own comparator
 * @param <T> type
 */
public class MyComparator<T extends Comparable<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o2.compareTo(o1);
    }
}
