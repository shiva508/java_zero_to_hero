package com.pool;

import java.util.concurrent.PriorityBlockingQueue;

public class WithdrownService implements Runnable {
    private PriorityBlockingQueue<String> queue;

    public WithdrownService(PriorityBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(5000);
                System.out.println(queue.take());
                Thread.sleep(1000);
                System.out.println(queue.take());
                System.out.println(queue.take());
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
