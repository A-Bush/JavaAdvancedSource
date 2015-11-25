package ua.com.webcamp.JavaAdv.Lesson04.Ex_02Modifiers;

import ua.com.webcamp.JavaAdv.Lesson04.Additional.*;

import java.lang.reflect.Modifier;

/**
 * Created by Artem Vereschaka on 8/11/15.
 * artem.andzen@gmail.com
 */
public class ReflModifiers {
    public static void main(String[] args) {
        Class aClass = Cat.class;

        // modifier of a class
        int modifiers = aClass.getModifiers();

        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isInterface(modifiers));
    }
}
