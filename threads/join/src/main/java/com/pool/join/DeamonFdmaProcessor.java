package com.pool.join;

public class DeamonFdmaProcessor implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("FDMA Daemon");
        }
    }
}
