package io.e6x;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class synchronize {

    public static void main(String[] args) throws InterruptedException {

        //printing numbers sequentially using three different threads
        //thread 1 prints even numbers. th2 odd. th 3 multiples of 5

        SynchronizeThread synchronizeThread = new SynchronizeThread();
        Thread thread1 =new Thread( () -> synchronizeThread.thread1() );//prints odd numbers
        Thread thread2 =new Thread( () -> synchronizeThread.thread2() );//prints even numbers
        Thread thread3 =new Thread( () -> synchronizeThread.thread3() );//prints multiples of 5

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();







    }
}
