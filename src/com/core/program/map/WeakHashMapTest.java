package com.core.program.map;

import java.util.WeakHashMap;

/**
 * 
 * When key will become null/out of scope then it will be garbage collected.
 * But in the case of hashmap it will be never garbage collected
 *
 */
public class WeakHashMapTest {

	public static void main(String[] args) {
		String key="Key1";
		WeakHashMap<String, String> map=new WeakHashMap<>();
		map.put(key, "Value");
		key=null;
		System.gc();
		System.out.println("==>"+map.size());
	}
}
