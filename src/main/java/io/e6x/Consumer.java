package io.e6x;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Product> queue;
    public Consumer(BlockingQueue<Product> q){
        queue = q;
    }
    public void run(){
        printProduct();
    }
    public void printProduct(){
        Product p = null;
        try {
            while (true) {
                p = queue.take();
                System.out.println("name of person: " + p.name + " ID: " + p.ID+" current time: " + p.timestamp);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
