package com.test.string.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceofSubString {

	public static void main(String[] args) {
		String str="HellouiuioHellooioioHello";
		Pattern pattern=Pattern.compile("Hello");
		Matcher matcher=pattern.matcher(str);
		int occurence=0;
		while(matcher.find()){
			occurence++;
		}
		System.out.println(occurence);
	}

}
