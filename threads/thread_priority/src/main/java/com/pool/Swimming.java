package com.pool;

public class Swimming implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is round :"+i);
        }
    }
}
