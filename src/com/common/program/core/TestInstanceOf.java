package com.common.program.core;

public class TestInstanceOf {

	public static void main(String[] args) 
    { 
        new MyThread().start(); 
        new MyThread(new MyRunnable()).start(); 
        Thread th=new Thread(new MyRunnable());
        th.start();
    } 

}


class MyThread extends Thread 
{ 
    MyThread() {} 
    MyThread(Runnable r) {super(r); } 
    public void run() 
    { 
        System.out.print("Inside Thread ");
    } 
} 
class MyRunnable implements Runnable 
{ 
    public void run() 
    { 
        System.out.print(" Inside Runnable"); 
    } 
} 