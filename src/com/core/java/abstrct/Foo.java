package com.core.java.abstrct;

public abstract class Foo {
	public abstract int FooMethod(int i);

	public int Yeeee() {
		for (int i = 0; i < 3; i++) {
			int res = FooMethod(i);
		}
		return 0;
	}
}
