package ua.com.webcamp.JavaAdv.Lesson05.Ex_06Inheritance;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        System.out.println( "is true: " + SuperClass.class.isAnnotationPresent( Anno.class ) );

        System.out.println( "is true: " + DerClass.class.isAnnotationPresent( Anno.class ) );

    }
}
