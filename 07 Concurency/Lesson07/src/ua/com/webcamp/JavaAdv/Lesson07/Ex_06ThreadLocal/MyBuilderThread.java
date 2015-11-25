package ua.com.webcamp.JavaAdv.Lesson07.Ex_06ThreadLocal;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents <b>MyBuilder</b> as thread
 */
public class MyBuilderThread extends Thread {

    private MyBuilder builder;

    public MyBuilderThread(MyBuilder builder) {
        this.builder = builder;
    }

    @Override
    public void run() {
        for (int i = 0; i < Math.random() * 10; i++) {
            builder.build();
        }

        System.out.println("My name is " + getName() + " and I built " + builder.getCount() + " things");

    }
}
