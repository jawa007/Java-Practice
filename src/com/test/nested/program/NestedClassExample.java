package com.test.nested.program;

/*static inner class: can declare static & non static members
 *  but can only access static members of its parents class.
non static inner class: can declare only non static
members but can access static and non static member of its parent class.
*/
public class NestedClassExample {

	public static class NestedClassExample1 {
		private int a = 0;
		private static int b = 0;
	}

	public class NestedClassExample2 {
		private int a = 0;
		private static final int b = 0;
	}

}
