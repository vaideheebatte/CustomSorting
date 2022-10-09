package com.sorting;

import java.util.TreeSet;

public class StudentComparableTest {
	
public static void main(String[] args)
{
	Student s1 = new Student(10, "AAA");
	Student s2 = new Student(20, "BBB");
	Student s3 = new Student(30, "CCC");
	
	TreeSet ts = new TreeSet();
	
	ts.add(s2);
	ts.add(s1);
	ts.add(s3);
	
	System.out.println(ts);
}
}
