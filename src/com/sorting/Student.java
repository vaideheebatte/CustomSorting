package com.sorting;

import java.util.Objects;

public class Student implements Comparable  {
	int roll;
	String name;
	
	public Student() {
		super();
	}
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(roll, name);
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o)
			return true;
		if (o == null  || getClass() != o.getClass())
			return false;
		Student student = (Student) o;
		return  Objects.equals(name, student.name) && roll == student.roll;
		
	}

//	@Override
//	public int compareTo(Object o) {
//		Student s = (Student) o;
//		return this.name.compareTo(s.name);
//	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		if (this.roll == s.roll)
			return 0;
		else if (this.roll > s.roll)
			return 4; 
		else 
			return -4; 
	}
	
}
