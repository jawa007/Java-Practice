package com.thread.win.horse;

public class RaceHorse extends Thread {
	public String name;

	public RaceHorse(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "  " + name);
		}
		System.out.println(name + " finished.");

		Runner.done();
	}
}
