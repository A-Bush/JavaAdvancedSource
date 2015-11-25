package ua.com.webcamp.JavaAdv.Lesson08.Ex_03FuncInterface;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Mathematics calc = (a) -> {
            int sum = 0;
            for (double d : a)
            {
                sum+=d;
            }
            return sum;
        };

        Mathematics calc2 = (a) -> a.length;

        System.out.println(calc.sqrt(100));
        System.out.println(calc.calculate(1,3,2,5));

        System.out.println(calc2.calculate(1,2,3,4,5,6));
    }
}
