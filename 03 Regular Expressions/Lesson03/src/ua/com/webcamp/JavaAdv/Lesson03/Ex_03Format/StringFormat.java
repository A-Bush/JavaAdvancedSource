package ua.com.webcamp.JavaAdv.Lesson03.Ex_03Format;

import java.util.Locale;

/**
 * Created by Artem Vereschaka on 8/7/15.
 */
public class StringFormat {
    public static void main(String[] args) {
        int count = 40;
        double costHex = 0xA9;

        String result = String.format(Locale.ENGLISH,"Count: %d\n Cost: %09.2f",count,costHex);
        String resultHex = String.format(Locale.ENGLISH,"Count: %d\nCost Hexadecimal: %x",count,(int)costHex);
        String resultScience = String.format(Locale.ENGLISH,"Count: %d\nCost Scientific Notation: %e",count,costHex);

        // try FRANCE and see how will change cost

        System.out.println(result);
        System.out.println(resultHex);
        System.out.println(resultScience);

        /* more on
        http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
        */
    }
}
