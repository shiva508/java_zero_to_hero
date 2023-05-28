package com.pool;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierClient {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        CyclicBarrier cyclicBarrier=new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("All task Completed");
            }
        });
        for(int i=0;i<5;++i) {
            executorService.execute(new CatchDevil(i + 1, cyclicBarrier));
        }
        executorService.shutdown();
    }
}
