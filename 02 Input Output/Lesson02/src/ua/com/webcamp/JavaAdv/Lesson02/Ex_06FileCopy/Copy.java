package ua.com.webcamp.JavaAdv.Lesson02.Ex_06FileCopy;

import java.io.*;

/**
 * Created by Artem Vereschaka on 8/6/15.
 */
public class Copy {
    public static void main(String[] args) {
        InputStream inStream = null;
        OutputStream outStream = null;

        try{

            File original =new File("Files/writeExample2.txt");
            File copied =new File("Files/copiedFile.txt");

            inStream = new FileInputStream(original);
            outStream = new FileOutputStream(copied);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0){

                outStream.write(buffer, 0, length);

            }

            inStream.close();
            outStream.close();

            System.out.println("File is copied successful!");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
