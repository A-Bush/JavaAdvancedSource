package ua.com.webcamp.JavaAdv.Lesson07.Ex_01Thread;

import org.apache.log4j.Logger;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */

/**
 * Implementation of Runnable interface
 */
public class MyRunnable implements Runnable {

    /**
     * Logger
     */
    Logger log = Logger.getLogger(MyRunnable.class.getName());

    @Override
    public void run() {
        log.info("MyRunnable running!");
    }
}
