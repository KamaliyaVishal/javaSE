package com.misc.collections;

import java.util.*;

/**
 * Demonstrates the use of Comparable interface for natural ordering.
 */
class Student implements Comparable<Student>
{
	int rollNo;
	String name;

	Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}

	// Implement compareTo for natural ordering (by rollNo)
	public int compareTo(Student s)
	{
		return this.rollNo - s.rollNo;
	}

	public String toString()
	{
		return rollNo + " " + name;
	}
}

public class ComparableDemo
{
	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student(102, "Alice"));
		list.add(new Student(101, "Bob"));
		list.add(new Student(103, "Charlie"));

		Collections.sort(list); // Uses compareTo

		System.out.println("Sorted by roll number (Comparable):");
		for (Student s : list)
		{
			System.out.println(s);
		}
	}
}