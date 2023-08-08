package io.e6x;

public class Counter {

    int timer ;
    public Counter(int ctr){
        this.timer = ctr;
    }
    public  void Increment(){
        this.timer +=1;
    }
    public int returnValue(){
        return this.timer;
    }
}
