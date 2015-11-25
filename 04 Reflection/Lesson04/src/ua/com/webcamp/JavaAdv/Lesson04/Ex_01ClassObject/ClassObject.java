package ua.com.webcamp.JavaAdv.Lesson04.Ex_01ClassObject;

import ua.com.webcamp.JavaAdv.Lesson04.Additional.Animal;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Cat;

/**
 * Created by Artem Vereschaka on 8/11/15.
 * artem.andzen@gmail.com
 */
public class ClassObject {
    public static void main(String[] args) {

        Class myObjectClass = Cat.class;
        Class unknownClass = null;
        try {
            //if we don't have a class now
            unknownClass = Class.forName("ua.com.webcamp.JavaAdv.Lesson04.Additional.Dog");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class t = Animal.class;

        System.out.println(t.getCanonicalName());

        System.out.println(t.getTypeName());
        System.out.println(t.getTypeName());
        System.out.println(myObjectClass.getCanonicalName());

        System.out.println(unknownClass);

        assert unknownClass != null;
        System.out.println(unknownClass.getSimpleName());
        System.out.println(unknownClass.getTypeName());
    }
}
