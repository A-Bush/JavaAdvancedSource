package ua.com.webcamp.JavaAdv.Lesson01.Ex_04Stack;

import java.util.Stack;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // LIFO - last in first out

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

    }
}
