package com.core.techgig;

class parent {
	public static int a = 10;

	public static void show() {
		System.out.println("hello===>");
	}
}

public class Test extends parent {
	public static void main(String[] args) {
		Test t = new Test();
		//a = 15;
		t.show();
	}
}
