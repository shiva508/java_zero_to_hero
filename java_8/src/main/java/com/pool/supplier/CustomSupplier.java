package com.pool.supplier;

@FunctionalInterface
public interface CustomSupplier<T> {
    T get();
}
