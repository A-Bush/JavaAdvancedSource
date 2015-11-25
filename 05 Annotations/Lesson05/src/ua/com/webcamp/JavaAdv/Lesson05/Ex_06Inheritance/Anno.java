package ua.com.webcamp.JavaAdv.Lesson05.Ex_06Inheritance;

import java.lang.annotation.*;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Anno {
}
