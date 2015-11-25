package ua.com.webcamp.JavaAdv.Lesson07.Ex_02RaceCondition;

/**
 * Created by Artem Vereschaka on 8/21/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t = new Thread(){
            @Override
            public void run() {
                counter.add(2);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                counter.add(6);
            }
        };

        t.start();
        t2.start();
        /*
        Imagine two threads A and B here
        this.count = 0;
        A:  reads this.count into a register (0)
        B:  reads this.count into a register (0)
        B:  adds value 2 to register
        B:  writes register value (2) back to memory. this.count now equals 2
        A:  adds value 3 to register
        A:  writes register value (3) back to memory. this.count now equals 3
        */
        Thread.sleep(400);
        System.out.println(counter.getCount());
    }
}
