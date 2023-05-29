package com.pool.biconsumer;

@FunctionalInterface
public interface CustomBiConsumer<T, U> {
    void accept(T t, U u);
}
