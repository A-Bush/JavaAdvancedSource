package ua.com.webcamp.JavaAdv.Lesson05.Ex_05Retrieving;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
public class MyClass {

    @Anno(name = "Artem")
    private int counter = 0;

    @AnnoMethod(date = "18.08.2015")
    public int getCount()
    {
        return counter++;
    }
}
