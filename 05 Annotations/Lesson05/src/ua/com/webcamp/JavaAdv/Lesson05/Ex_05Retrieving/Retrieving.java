package ua.com.webcamp.JavaAdv.Lesson05.Ex_05Retrieving;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
public class Retrieving {
    public static void main(String[] args) {
        Class<MyClass> object = MyClass.class;
        // Retrieve all annotations from the class
        Annotation[] annotations = object.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // Checks if an annotation is present
        if (object.isAnnotationPresent(Anno.class)) {

            // Gets the desired annotation
            Annotation annotation = object.getAnnotation(Anno.class);

            System.out.println(annotation);

        }
        // the same for all methods of the class
        for (Method method : object.getDeclaredMethods()) {

            if (method.isAnnotationPresent(AnnoMethod.class)) {

                Annotation annotation = method.getAnnotation(AnnoMethod.class);

                System.out.println(annotation);

            }

        }
    }
}
