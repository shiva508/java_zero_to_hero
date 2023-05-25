package com.pool;

public class LiveLockClient {
    public static void main(String[] args) {
        MoveSet moveSet=new MoveSet();
        new Thread(moveSet::signalTx,"signalTx").start();
        new Thread(moveSet::signalRx,"signalRx").start();
    }
}
