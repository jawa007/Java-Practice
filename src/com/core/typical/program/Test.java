package com.core.typical.program;

public class Test implements A, B {
	public static void main(String[] args) {
		Test t=new Test();
		//System.out.println(""+t.a);
	}

	@Override
	public void show() {
	System.out.println("show called");
	}
}
