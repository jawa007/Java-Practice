package com.common.program.practice;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	static List<Integer> list = new ArrayList<>(10);

	static Thread T1 = new Thread() {
		public void run() {
			synchronized (list) {
               while(list.size()==10){
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
               for (int i = 0; i < 10; i++) {
            	   list.add(i);
			    }
               list.notifyAll();
			}
		}
	};
	
	static Thread T2 = new Thread() {
		
		public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			synchronized (list) {
				while(list.size()==0){
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				list.remove(0);
				list.notifyAll();
			}
		}
	};

	public static void main(String[] args) {
		T1.start();
		T1.setName("Producer");
		T2.start();
		T2.setName("Consumer");
	}
}
