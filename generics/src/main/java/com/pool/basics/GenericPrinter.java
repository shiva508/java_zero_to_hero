package com.pool.basics;

public class GenericPrinter<T> {
	T userId;

	public GenericPrinter(T userId) {
		this.userId = userId;
	}

	public void printDetails() {
		System.out.println(this.userId);
	}
}
