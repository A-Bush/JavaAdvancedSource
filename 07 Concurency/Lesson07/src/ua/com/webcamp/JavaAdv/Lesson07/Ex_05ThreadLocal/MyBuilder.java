package ua.com.webcamp.JavaAdv.Lesson07.Ex_05ThreadLocal;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */

/**
 * Some builder with counter of objects
 */
public class MyBuilder {

    /**
     * Counter of objects
     */
    private int counter;

    /**
     * Builds
     */
    public void build() {

        System.out.println("Thread " + Thread.currentThread().getName() + " Build some structure...");
        counter++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public int getCount() {
        return counter;
    }
}
