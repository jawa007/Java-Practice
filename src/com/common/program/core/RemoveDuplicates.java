package com.common.program.core;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	private static void removeDuplicates(List<String> list) {
		int count = list.size();
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j--);
					count--;
				}
			}
		}
	}
	
	private static void removeDuplicatesWithList(List<String> list) {
		int count = list.size();
		for (int i = 1; i < count; i++) {
		    int j=i-1;
			if(list.contains(list.get(i))){
				
			}
		}
	}
	
	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("abc");
		lst.add("ram");
		lst.add("sita");
		lst.add("ram");
		lst.add("abc");
		lst.add("sita");
		//removeDuplicates(lst);
		removeDuplicatesWithList(lst);
		System.out.println(""+lst);
	}
	
	
	
}
