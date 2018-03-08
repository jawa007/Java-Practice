package com.core.java.overriding;

class StaticMethodParent {
	//	public static void A() {
	//		System.out.println("----parent--------");
	//	}
	
	public static final void A() {
		System.out.println("----parent--------"); // Compilation error
	}
	
	public void B() {
		System.out.println("----parent--B-----");
	}
	
	//	 private void BB() {
	//		System.out.println("----parent--BB-----");
	//	}
}

public class StaticMethod extends StaticMethodParent {
	public void B(int b) {
		System.out.println("----child---B-----");
	}
	
	//	 private void BB() {
	//			System.out.println("----parent--BB-----");
	//	 }
		
//	public static void A() {
//		System.out.println("----parent--------"); // Compilation error
//	}

//	public final void A() {
//		System.out.println("----child--------");
//	}
	
	
	public static void main(String[] args) {
		StaticMethodParent obj = new StaticMethod();
		obj.A();
	}
}
