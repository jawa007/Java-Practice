package com.sdg.example.thread;

import java.util.Date;

class TestJoinMethod1 extends Thread{  
	
	 public void run(){  
		 Thread thread = Thread.currentThread();
			System.out.println("RunnableJob is being run by " + thread.getName() + " at " + new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	 }  
	 
	public static void main(String args[]) throws Exception{  
	 TestJoinMethod1 t1=new TestJoinMethod1();  
	 TestJoinMethod1 t2=new TestJoinMethod1();  
	 TestJoinMethod1 t3=new TestJoinMethod1();  
	 t1.start();
	 t2.start(); 
	 t1.join();
	 t3.start(); 
	 try{  
		 t2.join(); 
		 t3.join();
	  System.out.println("------------------");
	 }catch(Exception e){System.out.println(e);}  
	
	 }  
	 
	}  