package ua.com.webcamp.JavaAdv.Lesson07.Ex_12Executor;

import java.util.concurrent.Callable;

/**
 * Created by Artem Vereschaka on 8/25/15.
 * artem.andzen@gmail.com
 */
public class Clazz implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sec = (int)(Math.random()*10000);
        Thread.sleep(sec);
        return sec;
    }
}
