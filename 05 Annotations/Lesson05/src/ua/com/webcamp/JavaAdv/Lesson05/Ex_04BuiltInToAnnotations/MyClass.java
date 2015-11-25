package ua.com.webcamp.JavaAdv.Lesson05.Ex_04BuiltInToAnnotations;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
public class MyClass {

    @Anno(name = "Artem")
    private int counter;

    @AnnoMethod(date = "18.08.2015")
    public int getCount()
    {
        return counter++;
    }
}
