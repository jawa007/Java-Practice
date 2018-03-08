package com.test.comparartor.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//References:http://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
public class SortingMultipleAttributesExample {

	public static void main(String[] args) {

		System.out.println("===== SORTING BY MULTIPLE ATTRIBUTES =====");

		List<Employee1> listEmployee1s = new ArrayList<Employee1>();

		listEmployee1s.add(new Employee1("Tom", "Developer", 45, 80000));
		listEmployee1s.add(new Employee1("Sam", "Designer", 30, 75000));
		listEmployee1s.add(new Employee1("Bob", "Designer", 45, 134000));
		listEmployee1s.add(new Employee1("Peter", "Programmer", 25, 60000));
		listEmployee1s.add(new Employee1("Tim", "Designer", 45, 130000));
		listEmployee1s.add(new Employee1("Craig", "Programmer", 30, 52000));
		listEmployee1s.add(new Employee1("Anne", "Programmer", 25, 51000));
		listEmployee1s.add(new Employee1("Alex", "Designer", 30, 120000));
		listEmployee1s.add(new Employee1("Bill", "Programmer", 22, 30000));
		listEmployee1s.add(new Employee1("Samuel", "Developer", 28, 80000));
		listEmployee1s.add(new Employee1("John", "Developer", 35, 67000));
		listEmployee1s.add(new Employee1("Patrick", "Developer", 35, 140000));
		listEmployee1s.add(new Employee1("Alice", "Programmer", 35, 80000));
		listEmployee1s.add(new Employee1("David", "Developer", 35, 99000));
		listEmployee1s.add(new Employee1("Jane", "Designer", 30, 82000));

		System.out.println("*** Before sorting:");

		for (Employee1 emp : listEmployee1s) {
			System.out.println(emp);
		}

		Collections.sort(listEmployee1s, new EmployeeChainedComparator(new EmployeeJobTitleComparator(),
				new EmployeeAgeComparator(), new EmployeeSalaryComparator()));

		System.out.println("\n*** After sorting:");

		for (Employee1 emp : listEmployee1s) {
			System.out.println(emp);
		}

	}
}
