package ua.com.webcamp.JavaAdv.Lesson02.Ex_02Path;

import java.io.File;
import java.io.IOException;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class Paths {
    public static void main(String[] args) {
        try{
            String filename = "ex02.txt";
            String directory = System.getProperty("user.dir") + File.separator + "Files";

            String path = "";

            path = directory + File.separator + filename;
            // or
            File file1 = new File(directory,filename);

            System.out.printf("Final filepath string : %s\n", path);
            System.out.printf("Final filepath file   : %s\n", file1.getAbsolutePath());

            File file = new File(path);

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File is already existed!");
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
