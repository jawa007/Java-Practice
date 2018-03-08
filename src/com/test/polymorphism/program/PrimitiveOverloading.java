package com.test.polymorphism.program;

public class PrimitiveOverloading {
	public void A(Integer a) {
		System.out.println("----Integer--------");
	}

	public void A(Long a) {
		System.out.println("----Long--------");
	}
	
	public void A(int a) {
		System.out.println("----int--------");
	}
	
	public void B(Object a) {
		System.out.println("----Object--------");
	}

	public void B(String a) {
		System.out.println("----String--------");
	}

	public static void main(String[] args) {
		PrimitiveOverloading obj = new PrimitiveOverloading();
		obj.A(10);
		//obj.A(new Long(10));
		// obj.A(10);
		//obj.B(null);
	}
}
