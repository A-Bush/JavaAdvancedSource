package ua.com.webcamp.JavaAdv.Lesson05.Ex_05Retrieving;

import java.lang.annotation.*;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */

/**
 * Documented annotation
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Anno {
    String name();
}
