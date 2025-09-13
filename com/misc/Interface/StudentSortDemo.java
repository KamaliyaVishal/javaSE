package com.misc.Interface;

import java.util.*;

// Student class with roll number, name, and age
class Student
{
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno()
	{
		return rollno;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	@Override
	public String toString()
	{
		return rollno + ": " + name + " : " + age;
	}
}

// Comparator to sort by roll number
class SortByRoll implements Comparator<Student>
{
	public int compare(Student a, Student b)
	{
		return a.rollno - b.rollno;
	}
}

// Comparator to sort by name, then by age
class SortByNameThenAge implements Comparator<Student>
{
	public int compare(Student a, Student b)
	{
		int nameCompare = a.name.compareTo(b.name);
		return (nameCompare == 0) ? Integer.compare(a.age, b.age) : nameCompare;
	}
}

public class StudentSortDemo
{
	public static void main(String[] args)
	{
		List<Student> students = new ArrayList<>();
		students.add(new Student(111, "Mayank", 21));
		students.add(new Student(131, "Anshul", 22));
		students.add(new Student(121, "Solanki", 23));
		students.add(new Student(101, "Aggarwal", 21));
		students.add(new Student(115, "Sneha", 23));
		students.add(new Student(119, "Sneha", 22));

		// Original List
		System.out.println("Original List:");
		for (Student s : students)
		{
			System.out.println(s);
		}
		System.out.println();

		// Sort by Roll Number
		Collections.sort(students, new SortByRoll());
		System.out.println("Sorted by Roll Number:");
		for (Student s : students)
		{
			System.out.println(s);
		}
		System.out.println();

		// Sort by Name, then by Age using Comparator class
		Collections.sort(students, new SortByNameThenAge());
		System.out.println("Sorted by Name, then by Age (Comparator class):");
		for (Student s : students)
		{
			System.out.println(s);
		}
		System.out.println();

		// Sort by Name, then by Age using Lambda
		students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));
		System.out.println("Sorted by Name, then by Age (Lambda):");
		for (Student s : students)
		{
			System.out.println(s);
		}
	}
}