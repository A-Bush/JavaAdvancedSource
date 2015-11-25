package ua.com.webcamp.JavaAdv.Lesson01.Ex_02Comparable;


/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student("Vasiliy","Pupkin",20);
        Student s2 = new Student("Alexander", "Ivanov", 23);

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

        Student s3 = new Student("Sergey", "Popov", 23);

        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s2));
    }
}
