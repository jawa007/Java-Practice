package com.sdg.example.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*1) Ability to lock interruptibly.
2) Ability to timeout while waiting for lock.
3) Power to create fair lock.
4) API to get list of waiting thread for lock.
5) Flexibility to try for lock without blocking.
*/
public class ReentrantLockExample {
	private int count=0;
	private Lock lock=new ReentrantLock();
	
	private void increment(){
		for(int i=0;i<1000;i++){
			count++;
		}
	}
	
	public void firstThread(){
		lock.lock();
		lock.lock();
		try{
			increment();
		}finally{
			lock.unlock();
		}
	}
	
	public void secondThread(){
		lock.lock();
		try{
			increment();
		}finally{
			lock.unlock();
		}
	}
	
	public void finished(){
		System.out.println("Count is..."+count);
	}
	
}



