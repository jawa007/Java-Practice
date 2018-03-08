package com.java.classloader;

public class TestClassLoader {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.java.classloader.Test");
	}
}

class Test {

	static {
		System.out.println("called");
	}

}