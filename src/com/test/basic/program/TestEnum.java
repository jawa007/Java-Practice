package com.test.basic.program;

public enum TestEnum implements Test1,Test2{
	;
	@Override
	public void show() {
	System.out.println();
	}
}

interface Test1{
	void show();
}


interface Test2{
	void show();
}