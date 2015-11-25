package ua.com.webcamp.JavaAdv.Lesson06.Ex_03SerializationStop;

import ua.com.webcamp.JavaAdv.Lesson06.Student;
import ua.com.webcamp.JavaAdv.Lesson06.Sex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Artem Vereschaka on 8/19/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Student st = new Subclass("Vasya","Pupkin",24, Sex.MALE);

        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("subclass.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(st);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in subclass.ser");
            // check this file
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}
