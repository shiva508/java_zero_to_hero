package com.pool;

import java.lang.annotation.Annotation;

public interface ConstraintValidator<A extends Annotation, T> {
	default void initialize(A constraintAnnotation) {
	}
}
