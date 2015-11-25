package ua.com.webcamp.JavaAdv.Lesson07.Ex_01Thread;

import org.apache.log4j.Logger;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws InterruptedException {

        // 1
        Thread thread = new Thread();
        thread.start();

        Thread.sleep(500);
        // 2
        MyThread myThread = new MyThread();
        myThread.start();

        Thread.sleep(500);
        // 3
        Thread threadAnon = new Thread() {
            @Override
            public void run() {
                log.info("Anonymous Thread running");
            }
        };
        threadAnon.start();

        Thread.sleep(500);
        // 4
        Thread threadRun = new Thread(new MyRunnable());
        threadRun.start();

        Thread.sleep(500);
        // 5
        Runnable myRun = new Runnable() {
            @Override
            public void run() {
                log.info("Anonymous Runnable running!");
            }
        };
        Thread anonRun = new Thread(myRun);
        anonRun.start();

        Thread.sleep(500);
        // names

        Thread namedThread = new Thread("MyThread") {
            @Override
            public void run() {
                log.info("Run by: " + this.getName());
            }
        };
        namedThread.start();

        Thread.sleep(1000);

        //example
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread("" + i) {
                public void run() {
                    System.out.println("Thread: " + getName() + " running");
                }
            };
            t.start();
        }

    }
}
