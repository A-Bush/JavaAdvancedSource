package ua.com.webcamp.JavaAdv.Lesson07.Ex_12Executor;

import org.apache.log4j.Logger;

import java.util.concurrent.*;

/**
 * Created by Artem Vereschaka on 8/25/15.
 * artem.andzen@gmail.com
 */
public class Main {
    static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService poolThreads = Executors.newFixedThreadPool(3);
        CompletionService<Integer> pool = new ExecutorCompletionService<Integer>(poolThreads);

        for (int i = 0; i<10;i++)
        {
            pool.submit(new Clazz());
        }

        log.info("Started");
        for (int i =0;i<10;i++)
        {
            log.info(String.format("Thread waited: %-2d seconds", pool.take().get()/1000));
        }

        poolThreads.shutdown();
    }
}
