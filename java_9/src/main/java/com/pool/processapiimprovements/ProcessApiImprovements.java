package com.pool.processapiimprovements;

public class ProcessApiImprovements {
	public static void main(String[] args) {
		ProcessHandle currentProcess = ProcessHandle.current();
		System.out.println(currentProcess.pid());
		System.out.println(currentProcess.info());
	}
}
