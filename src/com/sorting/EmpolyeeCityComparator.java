package com.sorting;

import java.util.Comparator;

public class EmpolyeeCityComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (emp1.Empcity.compareTo(emp2.Empcity));
	}

}
