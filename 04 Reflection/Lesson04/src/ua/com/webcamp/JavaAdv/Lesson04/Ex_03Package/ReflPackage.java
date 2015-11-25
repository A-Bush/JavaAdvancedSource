package ua.com.webcamp.JavaAdv.Lesson04.Ex_03Package;

import ua.com.webcamp.JavaAdv.Lesson04.Additional.*;

/**
 * Created by Artem Vereschaka on 8/11/15.
 * artem.andzen@gmail.com
 */
public class ReflPackage {
    public static void main(String[] args) {
        Class clazz = Cat.class;

        Package packageName = clazz.getPackage();
        System.out.println(packageName.getName());

        System.out.println(packageName.getImplementationTitle()); // information in manifest


    }
}
