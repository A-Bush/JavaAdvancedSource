package ua.com.webcamp.JavaAdv.Lesson02.Ex_01FileCreate;

import java.io.File;
import java.io.IOException;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class CreateFile {
    public static void main(String[] args) {
        try {

            File catalogue = new File("Files");

            catalogue.mkdir(); // create directory
            // to create multiple directories use mkdirs()

            File file = new File("Files/ex01.txt");

            if (file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
