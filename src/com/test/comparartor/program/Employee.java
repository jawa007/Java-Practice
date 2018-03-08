package com.test.comparartor.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

	private int age;
	
	private String name;
	
	public Employee(int age,String name){
		this.age=age;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class AgeComparator implements Comparator<Employee>{
		@Override
		public int compare(Employee o1, Employee o2) {
			return o2.getAge()-o1.getAge();
		}
	}
	
	public static class NameComparator implements Comparator<Employee>{
		@Override
		public int compare(Employee o1, Employee o2) {
			return o2.getName().compareTo(o1.getName());
		}
	}
	
	Runnable runnable= new Runnable() {
		public void run() {
			
		}
	};
	
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(40,"Pankaj"));
		list.add(new Employee(30,"Jawahar"));
		list.add(new Employee(50,"Dev"));
		//Collections.sort(list,new AgeComparator());
		Collections.sort(list,new NameComparator());
		System.out.println(list);
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
	
	
}
