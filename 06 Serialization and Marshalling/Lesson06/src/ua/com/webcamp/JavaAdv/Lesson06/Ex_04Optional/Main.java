package ua.com.webcamp.JavaAdv.Lesson06.Ex_04Optional;

import java.io.*;

/**
 * Created by Artem Vereschaka on 8/19/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        try{
            Book book = new Book("Book1", "Name Surname", 965, 1998);

            FileOutputStream fos = new FileOutputStream("book.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);

            out.writeObject(book);
            fos.close();
            out.close();

            FileInputStream fis = new FileInputStream("book.ser");
            ObjectInputStream in = new ObjectInputStream(fis);

            Book newBook = (Book) in.readObject();

            System.out.println(newBook.getName());
            System.out.println(newBook.getAuthor());
            System.out.println(newBook.getPages());
            System.out.println(newBook.getYear());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
