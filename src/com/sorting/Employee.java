package com.sorting;

import java.util.Objects;

public class Employee
{
	int Empid;
	String Empname;
	String Empcity;
	
	public Employee() {
		super();
	}
	
	public Employee(int Empid, String Empname, String Empcity) {
		super();
		this.Empid = Empid;
		this.Empname = Empname;
		this.Empcity = Empcity;
	}

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(Empid, Empname, Empcity);
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o)
			return true;
		if (o == null  || getClass() != o.getClass())
			return false;
		Employee object = (Employee) o;
		return  Objects.equals(Empname, object.Empname) && Objects.equals(Empcity, object.Empcity) && Empid == object.Empid;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
	 return "Student [Empid=" + Empid + ", Empname=" + Empname + ",Empcity="+ Empcity + "]";
	}

	
}
