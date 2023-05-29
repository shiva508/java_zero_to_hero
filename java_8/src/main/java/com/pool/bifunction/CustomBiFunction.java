package com.pool.bifunction;

public interface CustomBiFunction<T, U, R> {
    R apply(T t, U u);
}
