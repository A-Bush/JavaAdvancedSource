package ua.com.webcamp.JavaAdv.Lesson04.Ex_05Constructors;

import ua.com.webcamp.JavaAdv.Lesson04.Additional.Animal;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Color;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Artem Vereschaka on 8/11/15.
 * artem.andzen@gmail.com
 */
public class ReflConstructors {
    public static void main(String[] args) {
        Class<Dog> clazz = Dog.class;

        // all constructors
        Constructor[] constructors = clazz.getConstructors();
        // or only one with specified parameters
        Constructor constructor = null;
        try {
            constructor = clazz.getConstructor(String.class, int.class, Color.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        for ( Constructor ctor : constructors){
            Class[] parameterTypes = ctor.getParameterTypes();
            for (Class c : parameterTypes)
            {
                System.out.println(c.getSimpleName());
            }
        }

        assert constructor != null;
        try {
            Animal dog = (Animal)constructor.newInstance("Brien", 10, Color.Black);

            System.out.println(dog);
            System.out.println(dog.getName() + " " + dog.getWeight() + " " + dog.getColor());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
