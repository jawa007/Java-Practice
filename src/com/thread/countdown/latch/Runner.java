package com.thread.countdown.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class Runner {
	 public static void main(String args[]) {
	        AtomicReference<RaceHorse> winner =new AtomicReference<RaceHorse>();
	        CountDownLatch startingPistol = new CountDownLatch(1);
	        RaceHorse horse1 = new RaceHorse("Lol", startingPistol, winner);
	        RaceHorse horse2 = new RaceHorse("BOL", startingPistol, winner);
	        Thread thread1 = new Thread(horse1);
	        Thread thread2 = new Thread(horse2);
	        thread1.start();
	        thread2.start();
	        startingPistol.countDown();
	    }
}
