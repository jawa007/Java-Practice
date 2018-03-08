package com.test.inner.program;

public class TestInnerClass {
	private int age = 10;
	private static String name = "Rahul";

	//Anonymous Inner Class
	Dog dog = new Dog() {
		String color = "brown";
		//static String color1 = "brown";//C.ERROR
		@Override
		public void someDog() {
			System.out.println("Dog Age==>" + age + " name==>" + name);
		}
	};

	//Static Nested Class
	public static class Animal {
		int id=0;
		static int id1=0;
		
		private void show() {
			// System.out.println("Dog Age==>"+age+" name==>"+name); C.ERROR
		}
	}

	public static void main(String[] args) {

	}
}

interface Dog {
	public void someDog();
}
