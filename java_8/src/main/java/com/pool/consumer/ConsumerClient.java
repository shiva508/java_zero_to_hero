package com.pool.consumer;

import java.util.function.Consumer;

public class ConsumerClient {
    public static void main(String[] args) {
        Consumer<String> print = x -> System.out.println(x);
        print.accept("java");
    }
}
