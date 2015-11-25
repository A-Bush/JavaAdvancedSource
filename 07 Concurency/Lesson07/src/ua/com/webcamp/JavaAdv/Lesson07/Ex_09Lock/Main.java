package ua.com.webcamp.JavaAdv.Lesson07.Ex_09Lock;

/**
 * Created by Artem Vereschaka on 8/24/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        BarberQueue bq = new BarberQueue();

        for (int i = 0;i<10;i++)
        {
            new Thread(new Person(bq), "Thread " + (i+1)).start();
        }
    }
}
