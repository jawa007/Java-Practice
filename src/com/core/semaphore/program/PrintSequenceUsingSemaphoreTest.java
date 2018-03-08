package com.core.semaphore.program;

import java.util.concurrent.Semaphore;

class Control {
	public static int count = 0;
}

class Thread1 implements Runnable {
	Semaphore s1;
	Semaphore s2;
	Semaphore s3;
	private int count;

	Thread1(Semaphore s1, Semaphore s2, Semaphore s3, int count) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3=s3;
		this.count=count;
	}

	@Override
	public void run() {
		while (Control.count < 10) {
			try {
				s1.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "===>" + Control.count++);
			s2.release();
		}
	}

}

class Thread2 implements Runnable {
	Semaphore s1;
	Semaphore s2;
    Semaphore s3;
	private int count;

	Thread2(Semaphore s1, Semaphore s2, Semaphore s3, int count) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3=s3;
		this.count=count;
	}

	@Override
	public void run() {
		try {
			while (Control.count < 10) {
				s2.acquire();
				System.out.println(Thread.currentThread().getName() + "===>" + Control.count++);
				s3.release();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Thread3 implements Runnable {
	Semaphore s1;
	Semaphore s2;
    Semaphore s3;
	private int count;

	Thread3(Semaphore s1, Semaphore s2, Semaphore s3, int count) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.count=count;
	}

	@Override
	public void run() {
		while (count < 10) {
			try {
				s3.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "===>" + Control.count++);
			s1.release();
		}
	}

}

public class PrintSequenceUsingSemaphoreTest {
    volatile static int count=0;
	public static void main(String[] args) {

		Semaphore s1 = new Semaphore(1);
		Semaphore s2 = new Semaphore(0);
		Semaphore s3 = new Semaphore(0);

		Thread t1 = new Thread(new Thread1(s1, s2,s3,count),"T1");
		Thread t2 = new Thread(new Thread2(s1, s2,s3,count),"T2");
		Thread t3 = new Thread(new Thread3(s1, s2,s3,count),"T3");

		t1.start();
		t2.start();
		t3.start();
	}

}
