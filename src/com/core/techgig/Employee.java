package com.core.techgig;


public class Employee implements Comparable<Employee> {
    private Integer id = -1;
    private String firstName = null;
    private String lastName = null;
    private int age = -1;
 
    public Employee(int id, String fName, String lName, int age) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
 
    @Override
    public int compareTo(Employee o) {
        return this.id.compareTo(o.id);
    }
 
    @Override
    public String toString() {
        return "Employee : " + id + " - " + firstName + " - " + lastName
        + " - " + age + "n";
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
}
