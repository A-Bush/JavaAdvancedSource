package ua.com.webcamp.JavaAdv.Lesson08.Ex_04Pointers;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
/**
 * Represents different math operations
 */
@FunctionalInterface
public interface Mathematics {
    double calculate(double... a);

    default double sqrt(double a)
    {
        return Math.sqrt(a);
    }

}
