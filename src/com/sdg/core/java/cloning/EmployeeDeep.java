package com.sdg.core.java.cloning;

public class EmployeeDeep implements Cloneable {

	private int empoyeeId;
	private String employeeName;
	private Department department;

	public EmployeeDeep(int id, String name, Department dept) {
		this.empoyeeId = id;
		this.employeeName = name;
		this.department = dept;
	}
	
	//Modified clone() method in Employee class
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    Employee cloned = (Employee)super.clone();
	    cloned.setDepartment((Department)cloned.getDepartment().clone());
	    return cloned;
	}
	
	public int getEmpoyeeId() {
		return empoyeeId;
	}

	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
