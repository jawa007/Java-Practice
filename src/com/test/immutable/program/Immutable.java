package com.test.immutable.program;
/*
 * Why would one declare an immutable class final in Java?
 */

public class Immutable {
	
	private final int value;

	public Immutable(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
