package ua.com.webcamp.JavaAdv.Lesson03.Ex_05DateTimeFormatter;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by Artem Vereschaka on 8/7/15.
 */
public class FormatterExample {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M d yyyy");
        // use this format to get always two digits for the day
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
        LocalDate date = LocalDate.of(2015, Month.JULY, 1);
        System.out.println(date.format(formatter));
        System.out.println(date.format(f1));
        LocalDate d2 = LocalDate.of(2015, Month.SEPTEMBER, 15);
        formatter = DateTimeFormatter.ofPattern("MMMM d yyyy");
        System.out.println(d2.format(formatter));

        // more on
        // http://www.oracle.com/technetwork/articles/java/jf14-date-time-2125367.html
    }
}
