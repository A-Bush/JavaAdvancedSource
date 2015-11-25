package ua.com.webcamp.JavaAdv.Lesson01.Ex_01Comparator;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */

/**
 * Represent a student with name, surname and age.
 */
public class Student implements Comparator<Student> {

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
