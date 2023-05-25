package com.pool;

import java.util.concurrent.atomic.AtomicInteger;

public class SignalSamplerAtomic {

    private AtomicInteger samplerCount=new AtomicInteger(0);
    public synchronized void samplingRate(){
        for (int i = 0; i < 10000; i++) {
            samplerCount.incrementAndGet();
        }
    }
    public int getSamplerCount() {
        return samplerCount.get();
    }
}
