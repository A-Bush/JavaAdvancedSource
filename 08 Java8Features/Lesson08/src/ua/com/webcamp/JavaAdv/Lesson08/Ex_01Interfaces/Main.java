package ua.com.webcamp.JavaAdv.Lesson08.Ex_01Interfaces;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Mathematics calc = new MathImpl();

        System.out.println(calc.sqrt(100));
        System.out.println(calc.calculate(1,3,2,5));
    }
}
