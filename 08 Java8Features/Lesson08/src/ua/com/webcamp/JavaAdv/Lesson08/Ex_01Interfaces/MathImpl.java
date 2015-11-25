package ua.com.webcamp.JavaAdv.Lesson08.Ex_01Interfaces;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class MathImpl implements Mathematics {
    @Override
    public double calculate(double... a) {
        int sum = 0;
        for (double item : a)
        {
            sum += item;
        }
        return sum;
    }
}
