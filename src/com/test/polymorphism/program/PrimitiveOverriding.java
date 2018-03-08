package com.test.polymorphism.program;

class PrimitiveOverridingParent {
	public void A(Integer a) {
		System.out.println("----parent--------");
	}
}

public class PrimitiveOverriding extends PrimitiveOverridingParent {
	public void A(int a) {
		System.out.println("----child--------");
	}

	public static void main(String[] args) {
		PrimitiveOverridingParent obj = new PrimitiveOverriding();
		obj.A(10);
	}
}
