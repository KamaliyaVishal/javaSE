package com.misc.generics;

/**
 * MinMax Interface Example
 *
 * This interface defines methods to find the minimum and maximum values in a collection of elements
 * that implement the Comparable interface.
 *
 * @param <T> The type of elements that are comparable.
 */
interface GenericInterfaceDemo<T extends Comparable<T>>
{
	T min();

	T max();
}

class MyClass<T extends Comparable<T>>
		implements GenericInterfaceDemo<T>
{

	T[] values;

	// Constructor of 'MyClass' class
	MyClass(T[] obj)
	{
		values = obj;
	}

	// Defining abstract min() method
	public T min()
	{
		// 'T' is typename and 'o1' is object_name
		T o1 = values[0];

		// access of minimum element
		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(o1) < 0)
				o1 = values[i];

		// Return the minimum element in an array
		return o1;
	}

	// Defining abstract max() method
	public T max()
	{
		// 'T' is typename and 'o1' is object_name
		T o1 = values[0];

		// Get access of minimum element
		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(o1) > 0)
				o1 = values[i];

		// Return the maximum element in an array
		return o1;
	}
}

class MainClass
{
	// Main driver method
	public static void main(String[] args)
	{
		// Custom entries in an array
		Integer arr[] = {3, 6, 2, 8, 6};

		MyClass<Integer> obj1 = new MyClass<Integer>(arr);

		System.out.println("Minimum value: " + obj1.min());

		// printing the maximum value from array elements
		System.out.println("Maximum value: " + obj1.max());
	}
}