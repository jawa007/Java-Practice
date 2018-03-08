package com.sdg.example.thread;

public class ReentrantExampleTest {
	public static void main(String[] args) throws InterruptedException {
		
		final ReentrantLockExample example=new ReentrantLockExample();
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				example.firstThread();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				example.secondThread();;
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		example.finished();
	}
	
}
