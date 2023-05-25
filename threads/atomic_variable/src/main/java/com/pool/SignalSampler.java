package com.pool;

public class SignalSampler {
    private int samplerCount=0;
    public void samplingRate(){
        for (int i = 0; i < 10000; i++) {
            samplerCount++;
        }
    }
    public int getSamplerCount() {
        return samplerCount;
    }
}
