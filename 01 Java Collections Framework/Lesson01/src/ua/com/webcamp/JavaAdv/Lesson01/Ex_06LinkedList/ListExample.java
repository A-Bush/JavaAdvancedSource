package ua.com.webcamp.JavaAdv.Lesson01.Ex_06LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class ListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(0, 2);

        LinkedList<Integer> collection = new LinkedList<Integer>(){
            {
                add(3);
                add(4);
                add(5);
            }
        };

        linkedList.addAll(collection);
        linkedList.addFirst(10);
        linkedList.addLast(0);

        int number = linkedList.get(0);

        linkedList.remove(0);

        boolean result = linkedList.contains(10);
        int index = linkedList.indexOf(4);


        //Iterator is used explicitly
        Iterator<Integer> it = linkedList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());

        }


        linkedList.clear();


        //Foreach. It uses iterator implicitly
        for (Integer item : linkedList) {
            System.out.println(item);

        }

    }
}
