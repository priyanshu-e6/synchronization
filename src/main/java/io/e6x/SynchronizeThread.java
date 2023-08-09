package io.e6x;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizeThread {
    private static int check = 1;
    private final int max = 100;
    Lock lock = new ReentrantLock();
    public void thread1(){
        lock.lock();
        while(check < max){

            try {
                if ((check % 2 == 1) && !(check % 5 == 0)) {
                    System.out.println(Thread.currentThread().getId() + ": " + check);
                    check += 1;
                }
            } finally {
                lock.unlock();
            }
        }
    }
    public void thread2(){

        while(check < max) {
            lock.lock();
            try {
                if ((check % 2 == 0)) {
                    System.out.println(Thread.currentThread().getId() + ": " + check);
                    check += 1;
                }
            } finally {
                lock.unlock();
            }
        }
    }
    public void thread3(){

        while(check < max) {
            lock.lock();
            try {
                if ((check % 5 == 0)) {
                    System.out.println(Thread.currentThread().getId() + ": " + check);
                    check += 1;
                }
            } finally {
                lock.unlock();
            }
        }
    }

}