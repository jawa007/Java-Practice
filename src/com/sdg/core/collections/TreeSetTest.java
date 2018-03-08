package com.sdg.core.collections;

import java.util.Iterator;
import java.util.TreeSet;
//If we  add Custom class as key and not implement Comparable/Comparator then 
//we will get Runtime Exception

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Student> tr=new TreeSet<Student>();
		tr.add(new Student("jawahar"));
		tr.add(new Student("rahul"));
		tr.add(new Student("sumit"));
		
		Iterator<Student> itr=tr.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}


class Student implements Comparable<Student>{
	
	private String name;
	
	public Student(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	
	
	
}