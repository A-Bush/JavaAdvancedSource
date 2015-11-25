package ua.com.webcamp.JavaAdv.Lesson09.Ex_08Streams;

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
        boolean result;

        result = list.stream()
                .allMatch((s) -> s.startsWith("str"));
        System.out.println(result);

        result = list.stream()
                .anyMatch((s) -> s.startsWith("str"));
        System.out.println(result);


        result = list.stream()
                .noneMatch((s) -> s.startsWith("Z"));
        System.out.println(result);
    }


}
