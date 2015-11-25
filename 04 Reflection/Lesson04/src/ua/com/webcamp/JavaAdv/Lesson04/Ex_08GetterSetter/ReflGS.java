package ua.com.webcamp.JavaAdv.Lesson04.Ex_08GetterSetter;

import ua.com.webcamp.JavaAdv.Lesson04.Additional.Animal;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Cat;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Color;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Dog;

import java.lang.reflect.Method;

/**
 * Created by Artem Vereschaka on 8/12/15.
 * artem.andzen@gmail.com
 */
public class ReflGS {

    public static void printGettersSetters(Class aClass) {
        Method[] methods = aClass.getMethods();

        for (Method method : methods) {
            if (isGetter(method)) System.out.println("getter: " + method);
            if (isSetter(method)) System.out.println("setter: " + method);
        }
    }

    public static boolean isGetter(Method method) {
        if (!method.getName().startsWith("get")) return false;
        if (method.getParameterTypes().length != 0) return false;
        if (void.class.equals(method.getReturnType())) return false;
        return true;
    }

    public static boolean isSetter(Method method) {
        if (!method.getName().startsWith("set")) return false;
        if (method.getParameterTypes().length != 1) return false;
        return true;
    }

    public static void main(String[] args) {
        Animal anim1 = new Dog("Jacker",7, Color.Gray);

        printGettersSetters(anim1.getClass());
        System.out.println();

        printGettersSetters(Cat.class);
    }
}
