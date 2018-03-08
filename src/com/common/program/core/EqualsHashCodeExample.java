package com.common.program.core;

import java.util.HashSet;

class Employee {
	private String name;

	Employee(String name) {
		this.name = name;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
*/
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object a) {
		if (a == null) {
			return false;
		}
		if (getClass() != a.getClass()) {
			return false;
		}
		Employee employee = (Employee) a;
		if (this.name.equals(employee.name)) {
			return true;
		}
		return this.name.equals(employee.name);
	}

}

public class EqualsHashCodeExample {
	public static void main(String[] args) {
		HashSet<Employee> emp = new HashSet<Employee>();
		emp.add(new Employee("Ram"));
		emp.add(new Employee("Ram"));
        System.out.println(""+emp.size());
		if (emp.contains(new Employee("Ram"))) {
			System.out.println(" found");
		} else {
			System.out.println("not found");
		}
	}

}
