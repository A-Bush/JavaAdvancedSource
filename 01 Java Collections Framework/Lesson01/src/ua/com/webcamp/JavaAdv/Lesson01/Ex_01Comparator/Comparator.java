package ua.com.webcamp.JavaAdv.Lesson01.Ex_01Comparator;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public interface Comparator<T> {

    /**
     * Compares two objects.
     * @param o other object
     * @return 1 - if o is less than object, -1 - if o is bigger than object, 0 otherwise.
     */
    int compareTo(T o);
}
