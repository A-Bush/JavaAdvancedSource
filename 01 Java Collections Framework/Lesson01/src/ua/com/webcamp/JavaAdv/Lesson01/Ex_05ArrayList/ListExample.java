package ua.com.webcamp.JavaAdv.Lesson01.Ex_05ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class ListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(0,2);

        List<Integer> collection = new ArrayList<Integer>(){
            {
                add(3);
                add(4);
                add(5);
            }
        };

        arrayList.addAll(collection);

        int number = arrayList.get(0);

        arrayList.remove(0);

        boolean result = arrayList.contains(10);
        int index = arrayList.indexOf(4);


        //Iterator is used explicitly
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());

        }


        arrayList.clear();


        //Foreach. It uses iterator implicitly
        for (Integer item : arrayList) {
            System.out.println(item);

        }

    }
}
