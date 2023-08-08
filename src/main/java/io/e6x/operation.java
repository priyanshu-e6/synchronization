package io.e6x;

public class operation implements Runnable {
    int arr[];
    public operation(int arr[]){
        this.arr = arr;
    }
    public void run(){
        doAdd(arr);
    }
    public synchronized static void doAdd(int arr[]){
        for(int i=0;i<1_000_000;i++){
            arr[0]+=1;
        }
    }
}
