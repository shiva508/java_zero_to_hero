package com.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueClient {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
        DepositService depositService=new DepositService(queue);
        WithdrownService withdrownService=new WithdrownService(queue);
        new Thread(depositService).start();
        new Thread(withdrownService).start();
    }
}
