package ua.com.webcamp.JavaAdv.Lesson01.Ex_03Iterable;

import java.util.Iterator;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class Main {
    public static void main(String[] args) {
        Array<String> array = new Array<>(10);

        try {
            array.add("Jake");
            array.add("Nick");
            array.add("Alex");
            array.add("Denis");
            array.add("James");
            array.add("Martin");
        } catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("Explicitly used iterator");
        Iterator<String> iterator = array.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("Implicitly used iterator");
        for (String name : array)
        {
            System.out.println(name);
        }
    }
}
