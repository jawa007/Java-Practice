package com.sdg.example.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class PrintNumberUsingThreads {

	public static void main(String[] args) throws InterruptedException {

		Semaphore mutex = new Semaphore(1, true);
		PrintThread sharedObject = new PrintThread(mutex);

		ExecutorService service = Executors.newFixedThreadPool(3);
		for (int i = 1; i <= 100; i++) {

			service.submit(sharedObject);

		}
		service.shutdown();
	}

}

class PrintThread implements Runnable {
	int count = 0;
	Semaphore mutex;

	public PrintThread(Semaphore c) {
		this.mutex = c;
	}

	public void run() {
		try {
			mutex.acquire();
			Thread.sleep(5);
			System.out.println(Thread.currentThread().getName() + "---" + (++count));
			mutex.release();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
