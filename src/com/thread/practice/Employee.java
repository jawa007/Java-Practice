package com.thread.practice;

public class Employee {

	public synchronized void a() throws InterruptedException {
		Thread.sleep(40000);
		System.out.println(" Method a");
	}

	public synchronized void b() throws InterruptedException {
		Thread.sleep(40000);
		System.out.println(" Method  b");
	}

	public static synchronized void c() throws InterruptedException {
		Thread.sleep(40000);
		System.out.println(" Method c");
	}

	public static synchronized void d() throws InterruptedException {
		Thread.sleep(40000);
		System.out.println("  Method d");
	}

}
