package com.sdg.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoreExampleTest {
	
	public static void main(String[] args) throws Exception {
		ExecutorService executorService=Executors.newCachedThreadPool();
		for(int i=0;i<200;i++){
			executorService.submit(new Runnable() {
				@Override
				public void run() {
					Connection.getInstance().connect();
				}
			});
		}
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.DAYS);
	}
	
}
