package com.test.comparartor.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerSortingTest {
	public static void main(String[] args) {

		// create List & ArrayList reference to store customers
		List<Customer> listOfCustomers = new ArrayList<Customer>();

		// create customer objects using constructor initialization
		Customer cust1 = new Customer("Shalini", "Chennai", 60);
		Customer cust2 = new Customer("Sneha", "Pune", 73);
		Customer cust3 = new Customer("Simran", "Bangalore", 37);
		Customer cust4 = new Customer("Trisha", "Hyderabad", 52);
		Customer cust5 = new Customer("Shalini", "Chennai", 70);
		Customer cust6 = new Customer("Abirami", "Bangalore", 48);
		Customer cust7 = new Customer("Trisha", "Mangalore", 45);
		Customer cust8 = new Customer("Sneha", "Pune", 62);
		Customer cust9 = new Customer("Shalini", "Chennai", 50);

		// add customer objects to ArrayList
		listOfCustomers.add(cust1);
		listOfCustomers.add(cust2);
		listOfCustomers.add(cust3);
		listOfCustomers.add(cust4);
		listOfCustomers.add(cust5);
		listOfCustomers.add(cust6);
		listOfCustomers.add(cust7);
		listOfCustomers.add(cust8);
		listOfCustomers.add(cust9);

		// before Sorting: iterate using Iterator & while-loop
		Iterator<Customer> custIterator = listOfCustomers.iterator();

		System.out.println("Before Sorting: iterate using Iterator & while-loop\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		// sorting using Collections.sort(al, comparator);
		Collections.sort(listOfCustomers, new CustomerSortingComparator());

		// after Sorting: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting: iterate using enhanced for-loop\n");
		for (Customer customer : listOfCustomers) {
			System.out.println(customer);
		}
	}
}
