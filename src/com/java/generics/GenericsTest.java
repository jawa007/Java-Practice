package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static  void main(String... args){
		GenericClass<String,Object,String> gc = new GenericClass<String,Object,String>("sdf");
		List<Integer> list = new ArrayList<>();

		
	}
	
	static <E extends Integer> void method1(E l){
		
	}
	
}

class GenericClass<A,B,C>{
	A a;
	B b;
	final C c;
	public GenericClass(C c){
		this.c = c;
	}
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public C getC() {
		return c;
	}
	
}