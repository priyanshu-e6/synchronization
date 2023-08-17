package io.e6x;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<Weapon> queue;
    List<Weapon> weapons;
    public Producer(BlockingQueue<Weapon> q, List<Weapon> weapons ){
        this.queue = q;
        this.weapons = weapons;
    }
    public void run(){
        while(true){
            addItems();
            int size = queue.size();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(size == queue.size()){
                break;
            }

        }
    }
    public void addItems(){
        Random r = new Random();
        int weaponIndex= r.nextInt(3);
        queue.add(weapons.get(weaponIndex));
    }
}
