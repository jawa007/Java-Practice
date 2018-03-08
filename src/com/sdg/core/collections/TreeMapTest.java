package com.sdg.core.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//If we  add Custom class as key and not implement Comparable/Comparator then 
//we will get Runtime Exception

public class TreeMapTest {
	public static void main(String[] args) {

		Map<Student1, Integer> map = new TreeMap<Student1, Integer>();
		map.put(new Student1("Jawahar"), 1);
		map.put(new Student1("Rahul"), 2);

		Set<Entry<Student1, Integer>> entries = map.entrySet();

		for (Entry<Student1, Integer> entry : entries) {
			System.out.println("Key===>" + entry.getKey() + "Value==>" + entry.getValue());
		}
	}
}

class Student1 implements Comparable<Student1> {

	private String name;

	public Student1(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		return this.name.compareTo(o.name);
	}

}