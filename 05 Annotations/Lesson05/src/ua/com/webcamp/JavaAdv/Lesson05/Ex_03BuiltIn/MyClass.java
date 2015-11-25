package ua.com.webcamp.JavaAdv.Lesson05.Ex_03BuiltIn;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */

public class MyClass extends Parent {


    @Deprecated
    @Override
    public void f1() {
        // ...
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @SafeVarargs // Not actually safe!
    static void m(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // Semantically invalid, but compiles without warnings
        String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
    }
}
