package ua.com.webcamp.JavaAdv.Lesson04.Ex_09Private;

import ua.com.webcamp.JavaAdv.Lesson04.Additional.Animal;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Cat;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Color;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Artem Vereschaka on 8/12/15.
 * artem.andzen@gmail.com
 */
public class ReflPrivate {
    public static void main(String[] args) {
        Animal animal = new Cat("Murka", 10, Color.Ginger);

        Class clazz = animal.getClass();

        try {
            Field field = clazz.getDeclaredField("weight"); // not of superclass
            field.setAccessible(true);

            Integer fieldValue = (Integer) field.get(animal);
            System.out.println("fieldValue = " + fieldValue);

            field.set(animal,100);

            System.out.println();

            Method method = clazz.getDeclaredMethod("lazy");
            method.setAccessible(true);

            String str = (String) method.invoke(animal);
            System.out.println(str);

        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
