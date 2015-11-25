package ua.com.webcamp.JavaAdv.Lesson08.Ex_02Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class Lambdas {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {
            {
                add(10);
                add(8);
                add(11);
                add(7);
                add(3);
                add(3);
                add(-8);
                add(11);
                add(9);
                add(1);
                add(6);
                add(5);
            }
        };

        Collections.sort(list, new MyComparator<Integer>());

//        Collections.sort(list, (Integer a, Integer b) -> {
//            return b.compareTo(a);
//        });

        Collections.sort(list, (a, b) -> b.compareTo(a));

        for (int i : list) {
            System.out.println(i);
        }
    }
}
