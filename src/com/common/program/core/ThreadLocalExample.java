package com.common.program.core;

public class ThreadLocalExample {

	public static class MyRunnable implements Runnable {

		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
		private String s = "abc";

		@Override
		public void run() {
			try {
				threadLocal.set((int) (Math.random() * 100D));
				// if(Thread.currentThread().getName().equals("1"))Thread.sleep(1000);
				s = "" + Math.random() * 100D;
				// if(Thread.currentThread().getName().equals("2"))System.out.println(s);

				Thread.sleep(1000);
			} catch (Exception e) {
			}

			System.out.println(Thread.currentThread().getName() + "   -  " + threadLocal.get() + "  -  " + s);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyRunnable sharedRunnableInstance = new MyRunnable();

		Thread thread1 = new Thread(sharedRunnableInstance, "1");
		Thread thread2 = new Thread(sharedRunnableInstance, "2");

		thread1.start();
		thread2.start();

		thread1.join(); // wait for thread 1 to terminate
		thread2.join(); // wait for thread 2 to terminate
	}

}
