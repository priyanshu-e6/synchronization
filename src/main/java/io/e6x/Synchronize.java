package io.e6x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Synchronize {

    public static void main(String[] args) throws InterruptedException {
        //single producer single consumer
        int bound = 10;
        List<Weapon> weapons = new ArrayList<>();
        weapons.add(new Weapon("Locus", 60));
        weapons.add(new Weapon("AK-47", 35));
        weapons.add(new Weapon("M13", 30));
        BlockingQueue<Weapon> blockingQueue = new LinkedBlockingQueue<>(bound);

        Thread consumerThread= new Thread(new Consumer(blockingQueue, 100));
        Thread producerThread= new Thread(new Producer(blockingQueue, weapons));
        producerThread.start();
        consumerThread.start();








    }
}
