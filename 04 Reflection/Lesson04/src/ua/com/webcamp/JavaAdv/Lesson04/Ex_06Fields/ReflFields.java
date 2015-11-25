package ua.com.webcamp.JavaAdv.Lesson04.Ex_06Fields;

import ua.com.webcamp.JavaAdv.Lesson04.Additional.Animal;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Cat;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Color;
import ua.com.webcamp.JavaAdv.Lesson04.Additional.Dog;

import java.lang.reflect.Field;

/**
 * Created by Artem Vereschaka on 8/11/15.
 * artem.andzen@gmail.com
 */
public class ReflFields {
    public static void main(String[] args){
        Animal cat = new Cat("Kitty", 4, Color.Ginger);
        Class clazzCat = cat.getClass();
        Class clazzDog = Dog.class;

        Field[] catFields = clazzCat.getFields();
        Field[] dogFields = clazzDog.getFields();

        try {
            Field field = clazzCat.getField("name"); // only public

            String fieldName = field.getName();
            System.out.println(fieldName);

            Object fieldType = field.getType();
            System.out.println(fieldType.toString());

            Animal objectInstance = new Cat("Murka", 9, Color.Gray);

            Object value = field.get(objectInstance); // gets

            field.set(objectInstance, "Lol"); // sets

            System.out.println(objectInstance.getName());
        } catch (NoSuchFieldException | SecurityException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
