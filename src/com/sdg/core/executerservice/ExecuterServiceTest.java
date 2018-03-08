package com.sdg.core.executerservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceTest {
	
	public static void main(String[] args) {
		Thread T1 = new Thread(new Runnable() {
			@Override
			public void run() {
	            System.out.println("Thread 1");
			}
		});

		Thread T2 = new Thread(new Runnable() {
			@Override
			public void run() {
	            System.out.println("Thread 2");
			}
		});
		
		 ExecutorService executor = Executors.newFixedThreadPool(5);
		 executor.execute(T1);
		 executor.execute(T2);
		 
		 executor.shutdown();
	}
	
}
