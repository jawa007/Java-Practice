package com.common.program.core;

public class StaticExample {
	private static int currentCount = 0;

	public StaticExample() {
		currentCount++;
	}

	public static void increaseCount() {
		currentCount++;
	}
	
	public static void main(String[] args) {
		increaseCount();
		System.out.println(""+currentCount);
	}
	
	public void show(){
		currentCount++;
	}
}
