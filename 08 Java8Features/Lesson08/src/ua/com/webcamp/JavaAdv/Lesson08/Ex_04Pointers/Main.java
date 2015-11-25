package ua.com.webcamp.JavaAdv.Lesson08.Ex_04Pointers;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Mathematics calc  = (a)-> a.length;

        Clazz clazz = new Clazz();
        Mathematics calc2 = clazz::operation;

        System.out.println(calc.calculate(1,2,3,4,5));
        System.out.println(calc2.calculate(1,2,3,4,5));

    }
}
