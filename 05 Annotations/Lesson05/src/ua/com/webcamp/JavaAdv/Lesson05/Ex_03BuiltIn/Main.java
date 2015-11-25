package ua.com.webcamp.JavaAdv.Lesson05.Ex_03BuiltIn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
public class Main {

    @SuppressWarnings({"deprecation","unused"})
    public static void main(String[] args) {

        @SuppressWarnings("unused") // also we have it before method signature
        String s = "Something"; // unused variable

        MyClass c = new MyClass();
        c.f1(); // this is deprecated method

        method(); // unchecked

        int a = 2; // unused variable again
        List<String> l = new ArrayList<String>(){
            {
                add("One");
                add("Two");
            }
        };
        MyClass.m(l); // exception!

    }

    @SuppressWarnings("uncheked")
    public static void method() {
        // unchecked operations
        List list = new ArrayList();
        list.add("Element");
        list.get(0).toString();
    }
}
