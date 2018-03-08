package com.thread.countdown.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class RaceHorse implements Runnable {

	    private final String name;
	    private final CountDownLatch startingPistol;
	    private final AtomicReference<RaceHorse> winner;

	    public RaceHorse(String name, CountDownLatch startingPistol, AtomicReference<RaceHorse> winner)
	    {
	        this.name = name;
	        this.startingPistol = startingPistol;
	        this.winner = winner;
	    }

	    public void run()
	    {
	        try {
	        	  System.out.println("Thread===>"+Thread.currentThread());
	            startingPistol.await();
	            for(int i = 1 ; i <= 5; i++)
	            {
	                System.out.println(i+"  "+name);
	            }
	            boolean iWon = winner.compareAndSet(null, this);
	            System.out.printf("%s %s.%n", name, iWon? "won": "lost");
	        } catch (InterruptedException ex) {
	            System.out.printf("%s was assasinated before the race started.%n", name);
	            Thread.currentThread().interrupt();
	        }
	    }
}
