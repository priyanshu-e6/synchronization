package io.e6x;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class synchronize {
    public static void main(String[] args) {
        int[] arr = new int[1];
        arr[0] = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<?>> futures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            futures.add(executorService.submit(new operation(arr)));
        }
        System.out.println("final value: " + arr[0]);

     }
}
