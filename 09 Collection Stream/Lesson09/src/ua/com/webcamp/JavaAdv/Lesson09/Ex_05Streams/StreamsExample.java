package ua.com.webcamp.JavaAdv.Lesson09.Ex_05Streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class StreamsExample {

    public static List<String> getList() {
        List<String> list = new ArrayList<String>() {
            {
                add("Hello");
                add("str1");
                add("str2");
                add("str3");
                add("str4");
                add("strrr4");
                add("str5");
                add("str5");
                add("str123");
                add("Java");
            }
        };

        return list;
    }

    public static void main(String[] args) {

        List<String> list = getList();

        list.stream()
                .filter((s) -> s.contains("4"))
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .filter((s) -> s.length() == 4)
                .forEach(System.out::println);

    }
}
