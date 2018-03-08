package com.test.basic.program;

public abstract class AbstractClassTest {
	 abstract void bar( );
	 
	 public AbstractClassTest() {
		System.out.println("Constructor called");
	}
	 
	 
	 public static void main(String[] args) {
		 TestImpl  impl=new TestImpl();
		 impl.bar();
	}
}

class TestImpl extends AbstractClassTest{

	@Override
	void bar() {
		System.out.println("Bar");
	}
	
	
	
}
