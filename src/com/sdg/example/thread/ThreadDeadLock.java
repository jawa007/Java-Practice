package com.sdg.example.thread;

public class ThreadDeadLock {
	public static void main(String [] ar){
		final Object R1=null;
		final Object R2=null;
		Thread th1=new Thread(){
			public void run(){
				synchronized (R1) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (R2) {
						System.out.println("");
					}
				}
			}
		};
		
		Thread th2=new Thread(){
			public void run(){
				synchronized (R2) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (R1) {
						System.out.println("");
					}
				}
			}
		};
		th1.start();
		th2.start();
	}

}
