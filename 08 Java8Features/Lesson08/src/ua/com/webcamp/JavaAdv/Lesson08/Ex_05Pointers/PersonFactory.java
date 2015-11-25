package ua.com.webcamp.JavaAdv.Lesson08.Ex_05Pointers;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents factory for Person
 */
public interface PersonFactory {
    Person create(String firstName, String lastName);
    //Person create(String firstName, String lastName, int age);
}
