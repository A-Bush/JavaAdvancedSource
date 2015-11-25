package ua.com.webcamp.JavaAdv.Lesson08.Ex_04Pointers;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */

/**
 * Test class to obtain pointer to a method
 */
public class Clazz {

    public double operation(double... a)
    {
        double sum = 0.0;
        for (double x : a)
        {
            sum += x;
        }

        return sum;
    }
}
