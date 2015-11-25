package ua.com.webcamp.JavaAdv.Lesson03.Ex_06RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Artem Vereschaka on 8/7/15.
 */
public class RegExpr {
    public static void main(String[] args) {
        Pattern phoneNumPattern = Pattern.compile("\\(\\d{3}\\)\\s\\d{3}\\s\\d{2}\\s\\d{2}");

        String[] numbers = {
                "(096) 123 4567",
                "096 123 45 67",
                "(096) 190 75 17",
                "(096 123 45 67",
                "(096) 123 45 67",
                "(096)123 45 67",
                "(096)1234567",
                "(096) 999 42 02",
                "(096)134567",
                "(06)11234567",
        };

        for (String number : numbers) {
            Matcher matcher = phoneNumPattern.matcher(number);
            boolean isMatch = matcher.matches();
            System.out.printf("Number : %-20s is match? --> %s\n", number, isMatch);
        }

        // next example
        System.out.println("\nHiding of correct phone numbers.");
        for (String number : numbers) {
            Matcher matcher = phoneNumPattern.matcher(number);
            number = matcher.replaceAll("SECRET");
            System.out.printf("Number : %-20s\n", number);
        }

    }
}
