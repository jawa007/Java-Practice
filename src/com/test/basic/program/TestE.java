package com.test.basic.program;

public class TestE implements Test11,Test22 {

	@Override
	public void show() {
	}
}

interface Test11{
	void show();
}


interface Test22{
	void show();
}