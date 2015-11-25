package ua.com.webcamp.JavaAdv.Lesson07.Ex_01Thread;

import org.apache.log4j.Logger;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */

/**
 * Concrete thread as subclass of Thread
 */
public class MyThread extends Thread {

    Logger log = Logger.getLogger(MyThread.class.getName());

    public void run()
    {
        if (log.isDebugEnabled()){
            log.debug("MyThread running!");
        }
    }
}
