package com.pool.binaryoperator;

import com.pool.bifunction.CustomBiFunction;

@FunctionalInterface
public interface CustomBinaryOperator<T> extends CustomBiFunction<T, T, T> {

}
