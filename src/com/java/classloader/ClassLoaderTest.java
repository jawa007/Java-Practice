package com.java.classloader;

public class ClassLoaderTest {
	public static void main(String[] args) {
		JavaClassLoader javaClassLoader = new JavaClassLoader();
		javaClassLoader.invokeClassMethod("com.java.classloader.Test1");
		
		
	}

}

class Test1 {

	static {
		System.out.println("Class Test1 Loaded");
	}

	public void sayHello() {
		System.out.println("Method sayHello called");
	}

}