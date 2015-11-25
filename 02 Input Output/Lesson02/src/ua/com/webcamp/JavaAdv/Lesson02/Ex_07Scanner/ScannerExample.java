package ua.com.webcamp.JavaAdv.Lesson02.Ex_07Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Artem Vereschaka on 8/6/15.
 */
public class ScannerExample {
    public static void main(String[] args) {

        try {
            File file = new File("Files/scannerExample.txt");
            file.createNewFile();

            Scanner sc = new Scanner(new File(file.getAbsolutePath()));

            //sc.useDelimiter("\\d+");

            while (sc.hasNext())
            {
                System.out.println(sc.next());
            }

            // or manual

            /*System.out.println(sc.nextInt());
            System.out.println(sc.next());
            System.out.println(sc.nextInt());
            System.out.println(sc.next());*/

            // System.out.println(sc.nextInt());

            sc.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
