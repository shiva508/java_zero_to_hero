package com.pool.operations;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer("DASARI SHIVA &&DASARI SATISH","&&");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());	
		}
	}
}
