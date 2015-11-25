package ua.com.webcamp.JavaAdv.Lesson08.Ex_06Lambdas;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class Lambdas {
    public static void main(String[] args) {
        int N = 10;
        final int someNumber = 10;
        Operation<Integer, Integer> operation = (x)->x+someNumber;
        System.out.println(operation.operation(N));

        int someNumber2 = 20;
        operation = (x) -> x+someNumber2;
        System.out.println(operation.operation(N));

        int someNumber3 = 30;
        operation = (x) -> x+ someNumber3;
        System.out.println(operation.operation(N));
        // someNumber3 = 40; // TRY TO UNCOMMENT

    }
}
