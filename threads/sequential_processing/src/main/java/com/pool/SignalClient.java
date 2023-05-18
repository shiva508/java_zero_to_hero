package com.pool;

public class SignalClient {
    public static void main(String[] args) {
        TdmaProcessor tdmaProcessor=new TdmaProcessor();
        FdmaProcessor fdmaProcessor=new FdmaProcessor();
        tdmaProcessor.tdmaConvertion();
        fdmaProcessor.fmaConvertion();
    }
}
