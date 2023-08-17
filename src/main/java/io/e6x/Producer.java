package io.e6x;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<Product> queue;
    public Producer(BlockingQueue<Product> q){
        queue = q;
    }
    public void run(){

        while(true){
            if(!queue.offer(addItems())){
                break;
            }
        }
    }
    public Product addItems(){
        Random r = new Random();
        char name = (char) (r.nextInt(26) + 'A');
        int ID = r.nextInt();
        LocalTime time = LocalTime.now();
        return new Product(name, ID, time);
    }
}
