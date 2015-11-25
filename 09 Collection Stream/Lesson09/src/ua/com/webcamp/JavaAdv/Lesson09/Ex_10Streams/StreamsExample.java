package ua.com.webcamp.JavaAdv.Lesson09.Ex_10Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        Optional<String> reduced =
                getList()
                .stream()
                .filter(s->s.contains("str"))
                .sorted()
                .reduce((s1,s2)->s1 + "##" + s2);

        reduced.ifPresent(System.out::println);

    }


}
