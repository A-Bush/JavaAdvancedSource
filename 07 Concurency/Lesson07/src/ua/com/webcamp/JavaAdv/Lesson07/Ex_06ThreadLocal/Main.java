package ua.com.webcamp.JavaAdv.Lesson07.Ex_06ThreadLocal;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {

        // with ThreadLocal

        MyBuilder builder = new MyBuilder();
        Thread t1 = new MyBuilderThread(builder);
        Thread t2 = new MyBuilderThread(builder);

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
