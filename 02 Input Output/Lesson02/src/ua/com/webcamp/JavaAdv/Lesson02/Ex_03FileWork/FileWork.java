package ua.com.webcamp.JavaAdv.Lesson02.Ex_03FileWork;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Artem Vereschaka on 8/6/15.
 */
public class FileWork {

    public static void deleteOneFile()
    {
        //deleting of one file
        File file = new File("Files/ex02.txt");

        if (file.delete()) {
            System.out.println(file.getName() + " is deleted!");
        } else {
            System.out.println("Delete operation is failed.");
        }
    }

    public static void deleteByFilter()
    {
        // next example with filter
        // create *.txt files in folder Files
        // and a couple of other files like *.bin *.doc and so on
        String folder = "Files";
        File dir = new File(folder);

        FilenameFilter filter = new Filter("txt");
        String[] list = dir.list(filter);

        for (String fileToDelete : list) {
            String temp = new StringBuffer(folder)
                    .append(File.separator)
                    .append(fileToDelete)
                    .toString();

            File del = new File(temp);
            boolean isDeleted = del.delete();

            System.out.printf("File %s deleted: %s\n", temp, isDeleted);
        }
        // you can you filters like this to only find files and work with them
    }

    public static void renameFile()
    {
        //renaming
        File file1 = new File("oldName.txt");
        File file2 = new File("nEwNaMe.txt");

        if (file1.renameTo(file2)){
            System.out.println("Renamed successfully");
        }
        else {
            System.out.println("Rename failed");
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("------Delete one file-------");
            deleteOneFile();

            System.out.println("------Delete by filter------");
            deleteByFilter();

            System.out.println("--------Rename file---------");
            renameFile();


        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
