package ua.com.webcamp.JavaAdv.Lesson08.Ex_05Pointers;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        PersonFactory factory = Person::new;

        Person p1 = factory.create("Alan", "Fox");
        //Person p2 = factory.create(); // try to uncomment
    }
}
