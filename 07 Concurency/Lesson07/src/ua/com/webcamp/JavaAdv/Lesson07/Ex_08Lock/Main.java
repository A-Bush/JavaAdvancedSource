package ua.com.webcamp.JavaAdv.Lesson07.Ex_08Lock;

import org.apache.log4j.Logger;

/**
 * Created by Artem Vereschaka on 8/24/15.
 * artem.andzen@gmail.com
 */
public class Main {
    static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        log.info(String.format("Counter is equals to %s", counter.getCount()));
    }
}
