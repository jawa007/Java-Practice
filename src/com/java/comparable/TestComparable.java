package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
	public static void main(String[] args) {
		List<Apple> list = new ArrayList<>();
		list.add(new Apple("Kasmiri", new Color("Red"), 1));
		list.add(new Apple("Kasmiri", new Color("yellow"), 1));
		list.add(new Apple("Kasmiri", new Color("yellow"), 1));
		list.add(new Apple("Kasmiri", new Color("Black"), 1));
		Collections.sort(list);
		System.out.println("" + list);
	}
}
