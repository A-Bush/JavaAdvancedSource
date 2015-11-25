package ua.com.webcamp.JavaAdv.Lesson05.Ex_02CustomAnnotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        try {

            Method m = MyClass.class.getMethod("method");

            boolean isAnnotated = false;
            if (m.isAnnotationPresent(Named.class))
            {
                isAnnotated = true;
            }

            System.out.println("Annotation \"Named\" : " + isAnnotated);
            //try to comment annotation in MyClass


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
