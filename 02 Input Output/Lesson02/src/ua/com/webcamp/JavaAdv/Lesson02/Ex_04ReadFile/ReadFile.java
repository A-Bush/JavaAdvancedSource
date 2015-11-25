package ua.com.webcamp.JavaAdv.Lesson02.Ex_04ReadFile;

import java.io.*;

/**
 * Created by Artem Vereschaka on 8/6/15.
 */
public class ReadFile {
    public static void main(String[] args) {
        File file = new File("testExample4.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        BufferedReader reader = null;

        try {
            fis = new FileInputStream(file);

            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            reader = new BufferedReader(new FileReader(file));

            System.out.println("------DataInputStream example--------");
            while (dis.available() != 0) {
                System.out.println(dis.readLine()); // deprecated method
                // it is better to use BufferedReader
            }

            System.out.println("------Buffered reader example--------");
            //BufferedReader
            String temp;
            while ((temp = reader.readLine()) != null) {
                System.out.println(temp);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                bis.close();
                dis.close();
                if (reader != null)
                    reader.close();

                // OR use try-with-resources

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
