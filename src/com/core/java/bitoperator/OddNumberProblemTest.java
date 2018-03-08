package com.core.java.bitoperator;

public class OddNumberProblemTest {

	private int[] array={1,2,3,4,5,2,3,4,5,9,9,11,7,7,11,1,14};
	//private int[] array={1,1,2,3,2};
	
	
	int result=0;
	
	public int findSingleOdd(){
		for (int i :array) {
			result=result^i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		OddNumberProblemTest numberProblemTest=new OddNumberProblemTest();
		int singleOdd=numberProblemTest.findSingleOdd();
		System.out.println(singleOdd);
	}
}