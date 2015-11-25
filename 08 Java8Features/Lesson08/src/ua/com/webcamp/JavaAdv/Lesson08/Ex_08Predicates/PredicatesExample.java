package ua.com.webcamp.JavaAdv.Lesson08.Ex_08Predicates;

import java.util.function.Predicate;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class PredicatesExample {
    public static void main(String[] args) {
        // creation of predicate
        Predicate<String> predicate = (s) -> s.contains("Java");

        // strings
        String str1 = "Java is the best programming language!";
        String str2 = "Pascal is good PL for pupils.";

        // test
        predicate.test(str1); // TRUE
        predicate.test(str2); // FALSE

        // negate
        predicate.negate().test(str2); // TRUE

        // combines
        predicate.and((s) -> s.contains("Pascal"));
        String str3 = str1 + " " + str2;

        predicate.test(str3); // TRUE

        // use pointers
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

    }
}
