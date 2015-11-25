package ua.com.webcamp.JavaAdv.Lesson07.Ex_06ThreadLocal;

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
    //private int counter;
    private ThreadLocal<Integer> counter = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    /**
     * Builds
     */
    public void build() {

        System.out.println("Thread " + Thread.currentThread().getName() + " Build some structure...");
        counter.set(counter.get() + 1);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public int getCount() {
        return counter.get();
    }
}
