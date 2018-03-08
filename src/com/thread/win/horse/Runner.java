package com.thread.win.horse;

public class Runner {

	private static RaceHorse winner = null;

	synchronized static void done() {
		// Threads calling this are going to be RaceHorse objects.
		// Now, if there isn't already a winner, this RaceHorse is the winner.
		if (winner == null)
			winner = (RaceHorse) Thread.currentThread();
	}

	public static void main(String[] args) throws InterruptedException
    {
		  RaceHorse obj = new RaceHorse("Lol");
	      RaceHorse obj2 = new RaceHorse("BOL");
	      
         obj.start();
         obj2.start();
         
         // wait for them to finish
         
         obj.join();
         obj2.join();

         System.out.println(winner.name + " wins!");
    }
}
