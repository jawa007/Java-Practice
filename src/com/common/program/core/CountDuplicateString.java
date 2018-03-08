package com.common.program.core;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateString {
  /*
 http://javaconceptoftheday.com/check-one-string-is-rotation-of-another/
 */
	public static void main(String[] args) {
		    String str = "fftrreeoooppppnnnn11";
		    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		    char[] arr = str.toCharArray();
		    for (char value: arr) {
		       if (Character.isAlphabetic(value)) {
		           if (charMap.containsKey(value)) {
		               charMap.put(value, charMap.get(value) + 1);
		           } else {
		               charMap.put(value, 1);
		           }
		       }
		    }
		   System.out.println(charMap);
       }
}