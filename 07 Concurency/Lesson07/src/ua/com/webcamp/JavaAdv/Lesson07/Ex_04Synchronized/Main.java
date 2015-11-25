package ua.com.webcamp.JavaAdv.Lesson07.Ex_04Synchronized;

import org.apache.log4j.Logger;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        log.info(String.format("Counter is equals to %s", counter.getCount()));
    }
}
