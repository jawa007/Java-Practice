package com.sdg.core.exception;

public class MyAutoClosable implements AutoCloseable
{

	public void doIt() {
		System.out.println("MyAutoClosable doing it!");
	}

	@Override
	public void close() throws Exception {
		System.out.println("MyAutoClosable closed!");
	}
	
	private static void myAutoClosable() throws Exception {

	    try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
	        myAutoClosable.doIt();
	    }
	}
	
	public static void main(String[] args) {
		try {
			myAutoClosable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


