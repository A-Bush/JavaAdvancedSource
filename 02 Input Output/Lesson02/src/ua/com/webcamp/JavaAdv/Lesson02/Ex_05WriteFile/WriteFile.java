package ua.com.webcamp.JavaAdv.Lesson02.Ex_05WriteFile;

import java.io.*;

/**
 * Created by Artem Vereschaka on 8/6/15.
 */
public class WriteFile {
    public static void main(String[] args) {
        File file1 = new File("Files/writeExample1.txt");
        File file2 = new File("Files/writeExample2.txt");

        String content = "This is string that we write into the file!";

        try (FileOutputStream fop = new FileOutputStream(file1)) {

            if (!file1.exists())
                file1.createNewFile();
            if (!file2.exists())
                file2.createNewFile();

            byte[] bytes = content.getBytes();
            fop.write(bytes);
            fop.flush();
            System.out.println("Successfully FileOutputStream.");

            FileWriter fw = new FileWriter(file2.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close(); // flushes first
            System.out.println("Successfully BufferedWriter.");


            // if you want to append some text to existing you should do next
            FileWriter fileWritter = new FileWriter(file2.getAbsoluteFile(),true); // true as second parameter
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write("Appended text!");
            bufferWritter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
