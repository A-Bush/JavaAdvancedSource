package ua.com.webcamp.JavaAdv.Lesson07.Ex_13ScheduledExecutor;

import org.apache.log4j.Logger;

import java.util.concurrent.*;

/**
 * Created by Artem Vereschaka on 8/25/15.
 * artem.andzen@gmail.com
 */
public class Main {
    static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        for (int i = 0; i<10; i++) {
            ScheduledFuture scheduledFuture =
                    scheduledExecutorService.schedule(new Callable() {
                                                          public Object call() throws Exception {
                                                              log.info("Executed!");
                                                              return "Called!";
                                                          }
                                                      },
                            (int)(Math.random()*10),
                            TimeUnit.SECONDS);

        }

        scheduledExecutorService.shutdown();
    }
}
