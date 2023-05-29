package com.pool.book;

public class MemoryCell {
	private Object storedValue;

	public Object read() {
		return storedValue;
	}

	public void write(Object inputValue) {
		this.storedValue = inputValue;
	}
}
