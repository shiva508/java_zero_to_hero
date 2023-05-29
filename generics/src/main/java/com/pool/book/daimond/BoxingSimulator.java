package com.pool.book.daimond;

import com.pool.book.GenericMemoryCell;

public class BoxingSimulator {
	public static void main(String[] args) {
		GenericMemoryCell<Integer> memoryCell = new GenericMemoryCell<>();
		memoryCell.write(408);
		System.out.println(memoryCell.read());
	}
}
