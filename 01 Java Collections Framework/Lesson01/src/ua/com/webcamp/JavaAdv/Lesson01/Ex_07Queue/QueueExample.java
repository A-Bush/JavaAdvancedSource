package ua.com.webcamp.JavaAdv.Lesson01.Ex_07Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class QueueExample {
    public static void main(String[] args) {

        //FIFO - first in first out

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5);


        System.out.println(queue.remove()); // may throw an exception
        System.out.println(queue.poll()); // will return null if queue is empty

        System.out.println(queue.peek()); // may throw an exception
        System.out.println(queue.element()); // will return null if queue is empty


    }

}
