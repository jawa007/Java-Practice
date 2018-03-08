package com.sdg.example.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadSumOfArrayExecuterService {

	public static void main(String[] args) {
		int[] numbers = {0,9,8,7,6,5,4,3,2,1};
		int sum=0;
		
		ExecutorService executor = Executors.newFixedThreadPool(10);

		Worker[] workers = new Worker[10];

		int range = numbers.length / 10;
		for (int index = 0; index < 10; index++) {
			int startAt = index * range;
			int endAt = startAt + range;
			workers[index] = new Worker(startAt, endAt, numbers);
		}

		try {
			List<Future<Integer>> results = executor.invokeAll(Arrays.asList(workers));
			for (Future<Integer> future : results) {
				sum=sum+future.get();
			}
			System.out.println("total====>"+sum);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static class Worker implements Callable<Integer> {

		private int startAt;
		private int endAt;
		private int numbers[];

		public Worker(int startAt, int endAt, int[] numbers) {
			this.startAt = startAt;
			this.endAt = endAt;
			this.numbers = numbers;
		}

		@Override
		public Integer call() throws Exception {
			int max = Integer.MIN_VALUE;
			int sum=0;
			for (int index = startAt; index < endAt; index++) {
				//max = Math.max(numbers[index], max);
				sum=sum + numbers[index];
			}
			return sum;
		}

	}

}
