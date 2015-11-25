package ua.com.webcamp.JavaAdv.Lesson09.Ex_11ParallelStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class StreamsExample {

    public static void sequentialSort(List<String> list)
    {
        long t0 = System.nanoTime();

        long count = list.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }

    public static void parallelSort(List<String> list)
    {
        long t0 = System.nanoTime();

        long count = list.parallelStream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }
    public static void main(String[] args) {

        int max = 1000000;
        List<String> list = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            list.add(uuid.toString());
        }


        sequentialSort(list);
        parallelSort(list);



    }


}
