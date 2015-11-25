package ua.com.webcamp.JavaAdv.Lesson04.Ex_07Methods;

import ua.com.webcamp.JavaAdv.Lesson04.Additional.Animal;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Cat;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Color;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Artem Vereschaka on 8/12/15.
 * artem.andzen@gmail.com
 */
public class ReflMethods {
    public static void main(String[] args) {
        Animal kitty = new Cat("Barsik", 10, Color.Black);
        Class clazz = kitty.getClass();

        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.printf("Method: %s :: ",m.getName());
            for (Class param : m.getParameterTypes()){
                System.out.printf(" %s,",param);
            }
            System.out.printf(" :: Returns: %s\n",m.getReturnType());
        }


        System.out.println();
        //invoke
        try {
            Method method = Cat.class.getMethod("walk");

            String str = (String) method.invoke(kitty);
            System.out.println(str);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
