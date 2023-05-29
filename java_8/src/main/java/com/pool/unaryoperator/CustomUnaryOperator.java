package com.pool.unaryoperator;

import java.util.function.Function;

@FunctionalInterface
public interface CustomUnaryOperator<T> extends Function<T, T> {

}
