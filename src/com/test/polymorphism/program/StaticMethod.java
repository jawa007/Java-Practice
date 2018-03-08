package com.test.polymorphism.program;

class StaticMethodParent {
	public static void A() {
		System.out.println("----parent--------");
	}
	
	/*public final void A() {
		System.out.println("----parent--------");  Compilation error
	}*/
	
	public void B() {
		System.out.println("----parent--B-----");
	}
}

public class StaticMethod extends StaticMethodParent {
	public void B(int b) {
		System.out.println("----child---B-----");
	}
	/*public static void A() {
		System.out.println("----child--------");
	}*/

	/*public final void A() {
		System.out.println("----child--------");
	}
	*/
	
	public static void main(String[] args) {
		StaticMethodParent obj = new StaticMethod();
		obj.A();
	}
}
