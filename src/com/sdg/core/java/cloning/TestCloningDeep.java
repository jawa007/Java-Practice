package com.sdg.core.java.cloning;

/*http://howtodoinjava.com/2012/11/08/a-guide-to-object-cloning-in-java/
*/
public class TestCloningDeep {
	public static void main(String[] args) throws CloneNotSupportedException {
        Department hr = new Department(1, "Human Resource");
        Employee original = new Employee(1, "Admin", hr);
        Employee cloned = (Employee) original.clone();
        //Let change the department name in cloned object and we will verify in original object
        cloned.getDepartment().setName("Finance");
        System.out.println(original.getDepartment().getName());
    }
}
