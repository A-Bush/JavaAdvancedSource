package ua.com.webcamp.JavaAdv.Lesson06.Ex_02Deserialize;

import java.io.*;
import ua.com.webcamp.JavaAdv.Lesson06.Student;

/**
 * Created by Artem Vereschaka on 8/19/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        try
        {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student e = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized student:");
            System.out.println(e.getInfo());
        }catch(IOException i)
        {
            i.printStackTrace();
        }catch(ClassNotFoundException c)
        {
            System.out.println("Student class not found");
            c.printStackTrace();
        }
    }
}
