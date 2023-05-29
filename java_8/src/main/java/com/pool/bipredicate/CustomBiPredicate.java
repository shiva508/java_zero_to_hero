package com.pool.bipredicate;

@FunctionalInterface
public interface CustomBiPredicate<T, U> {
    boolean test(T t, U u);
}
