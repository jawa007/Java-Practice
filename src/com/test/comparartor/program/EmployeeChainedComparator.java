package com.test.comparartor.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeChainedComparator implements Comparator<Employee1> {
	private List<Comparator<Employee1>> listComparators;

	@SafeVarargs
	public EmployeeChainedComparator(Comparator<Employee1>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(Employee1 emp1, Employee1 emp2) {
		for (Comparator<Employee1> comparator : listComparators) {
			int result = comparator.compare(emp1, emp2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}

}

class EmployeeJobTitleComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 emp1, Employee1 emp2) {
		return emp1.getJobTitle().compareTo(emp2.getJobTitle());
	}
}

class EmployeeAgeComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 emp1, Employee1 emp2) {
		return emp1.getAge() - emp2.getAge();
	}
}

class EmployeeSalaryComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 emp1, Employee1 emp2) {
		return emp1.getSalary() - emp2.getSalary();
	}
}

class Employee1 {
	private String name;
	private String jobTitle;
	private int age;
	private int salary;

	public Employee1(String name, String jobTitle, int age, int salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
	}
}