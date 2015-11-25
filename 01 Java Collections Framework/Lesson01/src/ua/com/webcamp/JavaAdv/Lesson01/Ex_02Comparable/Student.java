package ua.com.webcamp.JavaAdv.Lesson01.Ex_02Comparable;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int age;


    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }
}
