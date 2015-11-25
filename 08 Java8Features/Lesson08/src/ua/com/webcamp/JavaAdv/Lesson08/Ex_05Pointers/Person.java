package ua.com.webcamp.JavaAdv.Lesson08.Ex_05Pointers;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents person as object
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        age = -1;
    }

    public Person() {
        age = -1;
    }

    public void print()
    {
        System.out.println("Hello, my name is " + firstName + " " + lastName +
                ". I am " + age + " years old");
    }
}
