package com.test.polymorphism.program;

public class TestException {

	
	public static int show(){
		try{
		    return 3;
		}
		catch(Exception e){
			return 2;
		}
		finally{
			return 1;
		}
	}
	
	public static void main(String[] args) {
		int res=show();
		System.out.println(""+res);
	}
	
}
