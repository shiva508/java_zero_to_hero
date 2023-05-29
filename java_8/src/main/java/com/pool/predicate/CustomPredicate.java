package com.pool.predicate;

@FunctionalInterface
public interface CustomPredicate<T> {
    boolean test(T t);
}
