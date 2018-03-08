package com.sdg.thread.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestBlock {

	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		final BlockingQueue queue=new ArrayBlockingQueue(1);
		
		Thread producer =new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("Putting 1");
					queue.add("1");
					System.out.println("Putting 2");
					queue.add("2");
					System.out.println("Putting 3");
					queue.add("3");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer =new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					System.out.println(queue.take());
					Thread.sleep(2000);
					System.out.println(queue.take());
					Thread.sleep(2000);
					System.out.println(queue.take());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
		
	}
	
	
}
