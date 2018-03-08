package com.test.oops.program;

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class RefAssignment {

	public static void main(String[] args) {
		Animal a=new  Animal("Lion");
		Animal b=new  Animal("Tiger");
		System.out.println(a.name +"<=====>"+b.name);
		show(a);
//		a=b;
//		System.out.println(a.name +"<==After===>"+b.name);
	}
	
	public static void show(Animal a){
		Animal c = new Animal("Dog");
		a=c;
		System.out.println(a.name +"<==Show===>"+c.name);
	}
}
