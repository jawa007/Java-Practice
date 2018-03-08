package com.common.program.core;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		HashMap hm =new HashMap();
		hm.put("a", "A");
		hm.put("b", "B");
		
		HashMap hm1 =new HashMap();
		hm1.put("a", "AA");
		
		hm.putAll(hm1);
		
		System.out.println(hm);
		
	}
}
