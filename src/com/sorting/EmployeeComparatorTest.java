package com.sorting;

import java.util.TreeSet;

public class EmployeeComparatorTest {

	public static void main(String[] args) {
		
		Employee e1 =new Employee(10, "Vaidehee", "Kolhapur");
		Employee e2 =new Employee(11, "Mugdha", "Panhala");
		Employee e3 =new Employee(12, "Pranali", "Sangli");
		
		EmployeeIdComparator idcom = new EmployeeIdComparator();
		EmployeeNameComparator namecom = new EmployeeNameComparator();
		EmpolyeeCityComparator citycom = new EmpolyeeCityComparator();
		
		TreeSet ts = new TreeSet(namecom);
		
		ts.add(e3);
		ts.add(e1);
		ts.add(e2);
		
		System.out.println(ts);
		
	}
}
