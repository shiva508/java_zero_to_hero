package com.pool.consumer;

@FunctionalInterface
public interface CustomConsumer<T> {
    void accept(T t);
}
