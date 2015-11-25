package ua.com.webcamp.JavaAdv.Lesson09.Ex_01Functions;

import java.util.function.Function;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class FunctionsExample {
    public static void main(String[] args) {
        Function<Double, Double> getSqrt = Math::sqrt;

        Function<Double, Double> add = getSqrt.andThen((s) -> s + 10);

        System.out.println(add.apply(9.0));
        System.out.println(getSqrt.compose((Double s) -> s + 10).apply(9.0));
    }
}
