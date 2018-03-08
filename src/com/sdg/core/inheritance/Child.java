package com.sdg.core.inheritance;

class Base {
	final public void show() {
		System.out.println("Base::show() called");
	}

	private void showTest() {
		System.out.println(" private Base::show1() called");
	}

	public static void doMethod() {
		System.out.println("do method");
	}
	
	public void showTest1() {
		System.out.println(" public Base::showTest1() called");
	}
}

public class Child extends Base {
	
	private void showTest() {
		System.out.println(" private Base::show1() called");
	}
	
	public void showTest1() {
		System.out.println(" public Child::showTest1() called");
	}
	
	// Compilation time Error
	/*
	 * public void show() { System.out.println("Derived::show() called"); }
	 */

	// Compilation time Error
	/*
	 * public void doMethod(){ System.out.println("do method"); }
	 */
	public static void main(String[] args) {
		Base b = new Child();
		//Child c=(Child)new Base();
		// Child b1 = new Child();
		// b1.show();
		b.show();
		b.showTest1();
		//c.showTest();
		//b1.showTest();
		
	}
}
