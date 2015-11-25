package ua.com.webcamp.JavaAdv.Lesson09.Ex_03Consumer;

import java.util.function.Consumer;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Student> consumer = (s)-> System.out.println("Hello, " + s.getName());

        Student student = new Student("James Ford", 36);

        consumer.accept(student);

        System.out.println();
        
        consumer.andThen((s)-> System.out.println("Your age is " + s.getAge() + " years"))
                .accept(student);


    }
}
