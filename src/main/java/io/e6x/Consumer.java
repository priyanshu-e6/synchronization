package io.e6x;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Weapon> queue;
    int hitPoints;
    public Consumer(BlockingQueue<Weapon> q, int hitPoints){
        queue = q;
        this.hitPoints = hitPoints;
    }
    public void run(){
        Die();
    }
    public void Die(){
        while(hitPoints > 0){
            try {
                Weapon x = queue.take();
                hitPoints -= x.damage;
                hitPoints = (hitPoints <0) ? 0 : hitPoints;
                System.out.println("Player shot by: " + x.weaponName + " .Player present health: " + hitPoints);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
