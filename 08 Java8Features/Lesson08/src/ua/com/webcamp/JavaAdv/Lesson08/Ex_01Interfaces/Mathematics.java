package ua.com.webcamp.JavaAdv.Lesson08.Ex_01Interfaces;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents different math operations
 */
public interface Mathematics {
    /**
     * Calculates an operation on array
     * @param a array
     * @return result of defined operation
     */
    double calculate(double... a);

    /**
     * Returns square root of parameter a
     * @param a double number
     * @return square root
     */
    default double sqrt(double a)
    {
        return Math.sqrt(a);
    }
}
