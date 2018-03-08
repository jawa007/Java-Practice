package com.thread.practice;

public class MainThread {
	public static void main(String[] args) {
		TestThread th1=new TestThread();
		
		TestThread th2=new TestThread();
		
		Thread t1=new Thread(th1,"T1");
		
		Thread t2=new Thread(th2,"T2");
		
		t1.start();
		t2.start();
	}
}
