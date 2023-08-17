package io.e6x;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Synchronize {

    public static void main(String[] args) throws InterruptedException {
        //single producer single consumer
        int bound = 10;
        BlockingQueue<Product> blockingQueue = new LinkedBlockingQueue<>(bound);

        Thread consumerThread= new Thread(new Consumer(blockingQueue));
        Thread producerThread= new Thread(new Producer(blockingQueue));
        producerThread.start();
        consumerThread.start();








    }
}
