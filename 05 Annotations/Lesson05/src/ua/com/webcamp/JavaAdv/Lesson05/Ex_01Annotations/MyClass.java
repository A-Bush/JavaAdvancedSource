package ua.com.webcamp.JavaAdv.Lesson05.Ex_01Annotations;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
@Deprecated
public class MyClass {

    /**
     * This is custom method marked as Deprecated
     */
    @Deprecated
    public void method1()
    {
        System.out.println("Something");
    }
}
