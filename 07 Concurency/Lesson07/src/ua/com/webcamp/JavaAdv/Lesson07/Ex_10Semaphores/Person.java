package ua.com.webcamp.JavaAdv.Lesson07.Ex_10Semaphores;

/**
 * Created by Artem Vereschaka on 8/24/15.
 * artem.andzen@gmail.com
 */
public class Person implements Runnable {
    /**
     * ID generator
     */
    private static int ID = 0;
    /**
     * ID of person
     */
    private int id;
    /**
     * BarberShop Queue
     */
    private BarberQueue queue;

    public Person(BarberQueue barberQueue)
    {
        queue = barberQueue;
        id = ++ID;
    }

    @Override
    public void run() {
        System.out.println(id + ":: Going to cut my hair...");
        queue.serve(this);
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
