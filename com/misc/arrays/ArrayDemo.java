package com.misc.arrays;// Java program demonstrating all key points about arrays

/*
 * This program covers:
 * 1. Declaration of arrays (two ways)
 * 2. Initialization of arrays
 * 3. Assigning values to array elements
 * 4. Array literal initialization
 * 5. Accessing and updating an element
 * 6. Getting array length
 * 7. Traversing array (accessing all elements)
 * 8. Arrays of objects
 * 9. Accessing element outside array size (will throw exception)
 * 10. Passing array to method
 * 11. Returning array from method
 * 12. Advantages and disadvantages of arrays
 */
class Student
{
	public int roll_no;
	public String name;

	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

public class ArrayDemo
{
	// Method to sum array elements (demonstrates passing array to method)
	public static int sum(int[] arr)
	{
		int total = 0;
		for (int i = 0; i < arr.length; i++)
			total += arr[i];
		return total;
	}

	// Method returning an array (demonstrates returning arrays from methods)
	public static int[] getArray()
	{
		return new int[] {1, 2, 3};
	}

	public static void main(String[] args)
	{
		// 1. Declaration of arrays (two ways)
		int arr1[];      // Method 1
		int[] arr2;      // Method 2

		// 2. Initialization of arrays
		arr1 = new int[5]; // Allocating memory for 5 integers

		// 3. Assigning values to array elements (default values are 0)
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;

		// 4. Array literal initialization
		int[] arr3 = {40, 55, 63, 17, 22, 68, 89, 97, 89};

		// 5. Accessing and updating an element
		arr1[0] = 90; // Changing first element to 90

		// 6. Getting array length
		int n = arr1.length;

		// 7. Traversing array (accessing all elements)
		System.out.println("Elements of arr1:");
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();

		// 8. Arrays of objects
		Student[] students = new Student[3]; // Array of Student objects
		students[0] = new Student(1, "Aman");
		students[1] = new Student(2, "Vaibhav");
		students[2] = new Student(3, "Shikar");

		System.out.println("Student array elements:");
		for (int i = 0; i < students.length; i++)
			System.out.println("Element at " + i + ": { " + students[i].roll_no + " " + students[i].name + " }");

		// 9. Accessing element outside array size (will throw exception)
		try
		{
			System.out.println("Accessing out-of-bounds element:");
			System.out.println(arr1[10]); // This will throw ArrayIndexOutOfBoundsException
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception caught: " + e);
		}

		// 10. Passing array to method
		int[] arr4 = {3, 1, 2, 5, 4};
		int total = sum(arr4);
		System.out.println("Sum of arr4 elements: " + total);

		// 11. Returning array from method
		int[] returnedArray = getArray();
		System.out.print("Returned array: ");
		for (int i = 0; i < returnedArray.length; i++)
			System.out.print(returnedArray[i] + " ");
		System.out.println();

		// 12. Advantages and disadvantages (in comments)
		// Advantages:
		// - Fast O(1) access by index
		// - Predictable memory management (fixed size)
		// - Structured data organization
		// Disadvantages:
		// - Fixed size (cannot change after creation)
		// - Only stores elements of the same type
		// - Costly insertion/deletion in the middle due to shifting
	}
}