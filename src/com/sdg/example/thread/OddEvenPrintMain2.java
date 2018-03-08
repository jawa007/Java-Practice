package com.sdg.example.thread;

public class OddEvenPrintMain2 {
	static boolean odd;
	static int count = 1;
	static Object lock = new Object();
	static int Max = 10;

	static Thread T1 = new Thread() {
		public void run() {
			while (count < Max) {
				synchronized (lock) {
					while (!odd) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(T1.currentThread().getName() + "===>" + count++);
					odd = false;
					lock.notifyAll();
				}
			}
		}
	};

	static Thread T2 = new Thread() {
		public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			while (count < Max) {
				synchronized (lock) {
					while (odd) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(T2.currentThread().getName() + "===>" + count++);
					odd = true;
					lock.notifyAll();
				}
			}
		}
	};

	public static void main(String[] args) throws InterruptedException {
		T1.start();
		T1.setName("Even");
		T2.start();
		T2.setName("Odd");
		//T1.join();
		//T2.join();
	}
}
