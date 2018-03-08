package com.test.polymorphism.program;

import java.io.FileNotFoundException;
import java.io.IOException;

class OverridingExceptionParent {
	public void show() throws IOException {
		System.out.println("Parent show");
	}
}

public class OverridingException extends OverridingExceptionParent {
	public void show() throws NullPointerException, FileNotFoundException {
		System.out.println("child show");
	}

	public static void main(String[] args) throws Exception {
		OverridingExceptionParent exceptionParent = new OverridingException();
		exceptionParent.show();
	}
}
