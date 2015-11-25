package ua.com.webcamp.JavaAdv.Lesson09.Ex_02Supplier;

import java.util.function.Supplier;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new;

        Student s = studentSupplier.get();
        System.out.println(s);
    }
}
