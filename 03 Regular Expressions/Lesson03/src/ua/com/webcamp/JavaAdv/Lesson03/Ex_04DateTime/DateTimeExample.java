package ua.com.webcamp.JavaAdv.Lesson03.Ex_04DateTime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by Artem Vereschaka on 8/7/15.
 */
public class DateTimeExample {
    public static void main(String[] args) {
        // The current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        // from values
        LocalDate d1 = LocalDate.of(2015, Month.JULY, 13);

        // construct time object based on hours and minutes
        LocalTime t1 = LocalTime.of(17, 18);
        // create time object based on a String
        LocalTime t2 = LocalTime.parse("10:15:30");

        // Get the time or date from LocalDateTime
        LocalDate date = dateTime.toLocalDate();
        LocalTime  time = dateTime.toLocalTime();
        System.out.println(date + " " + time);

        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();
        int minute = dateTime.getMinute();


        // Perform operations on these objects will always return a new object
        // as these objects are immutable

        LocalDateTime updatedDate = dateTime.withDayOfMonth(13).withYear(2015);
        LocalDateTime plusYears = updatedDate.plusDays(25).plusYears(2);
        System.out.println(plusYears);

        // the API also allow to use Adjusters for the API,
        // for example the following will set the day to the last day in the monthd
        LocalDateTime newDate = dateTime.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(newDate);
        // You can also truncate certain time units, e.g., remove the seconds from a time
        // object
        LocalTime truncatedSeconds = t2.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncatedSeconds);

        // define a duration of 5 hours
        Duration duration = Duration.ofHours(5);
        // add 20 minutes
        Duration plusMinutes = duration.plusMinutes(20);


    }
}
