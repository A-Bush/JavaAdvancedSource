package ua.com.webcamp.JavaAdv.Lesson04.Ex_04Superclass_Interfaces;

import ua.com.webcamp.JavaAdv.Lesson04.Additional.Animal;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Cat;

/**
 * Created by Artem Vereschaka on 8/11/15.
 * artem.andzen@gmail.com
 */
public class ReflSuperInterfaces {
    public static void main(String[] args) {
        Class clazz = Cat.class;

        Class superclass = clazz.getSuperclass();

        System.out.printf("Super class for %s is %s\n", clazz.getSimpleName(), superclass.getSimpleName());

        Class[] interfaces = clazz.getInterfaces();

        for (Class interfaze : interfaces)
        {
            // nothing here
            System.out.printf("Implementing : %s interface", interfaze.getSimpleName());
        }

        Class clazzAnim = Animal.class;
        interfaces = clazzAnim.getInterfaces();

        for (Class interfaze : interfaces)
        {
            System.out.printf("%s is implementing : %s interface", clazzAnim.getSimpleName(), interfaze.getSimpleName());
        }
    }
}
