package ua.com.webcamp.JavaAdv.Lesson05.Ex_02CustomAnnotations;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
public @interface Annotation {
    String name() default "unknown";
}
