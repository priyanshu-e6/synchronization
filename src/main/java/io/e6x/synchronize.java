package io.e6x;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class synchronize {
    public static void main(String[] args) throws InterruptedException {
        //making counter class and synchronizing it without the need to make static method

        Counter counter = new Counter(0);
        Thread thread1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i=0;i<1_000_000;i++) {
                            counter.Increment();
                        }
                    }
                }
        );
        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i=0;i<1_000_000;i++) {
                            counter.Increment();
                        }
                    }
                }
        );
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.returnValue());





     }
}
