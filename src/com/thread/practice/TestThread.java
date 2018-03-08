package com.thread.practice;

public class TestThread implements Runnable {

	Employee ee1 = new Employee();
	Employee ee2 = new Employee();

	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName());
		try {
			ee1.a();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread "+Thread.currentThread().getName());
		try {
			ee2.b();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
