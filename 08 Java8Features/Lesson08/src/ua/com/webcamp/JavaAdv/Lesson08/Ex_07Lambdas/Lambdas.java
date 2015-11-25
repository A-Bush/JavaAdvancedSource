package ua.com.webcamp.JavaAdv.Lesson08.Ex_07Lambdas;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class Lambdas {

    static int staticInt = 10;
    int simpleInt = 20;

    public void method() {
        Operation<Integer, Integer> op1 = (a) -> {
            staticInt = 30;
            simpleInt = 40;
            return a * (staticInt + simpleInt);
        };

        System.out.println(op1.operation(10));
    }

    public static void main(String[] args) {
        new Lambdas().method();
    }
}
