package ua.com.webcamp.JavaAdv.Lesson05.Ex_04BuiltInToAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface AnnoMethod {
    String date();
}
