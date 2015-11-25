package ua.com.webcamp.JavaAdv.Lesson05.Ex_02CustomAnnotations;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
@Annotation(name = "Artem Vereschaka")
public class MyClass {

    @Named("Artem") // try to comment
    public static void method(){
        //...
    }
}
