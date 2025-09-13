package com.misc.generics;

import java.util.*;

/**
 * Generics with Collections Example
 *
 * This class demonstrates the use of generics with Java Collections.
 * It includes examples of type-safe collections, generic methods,
 * and the use of wildcards (unbounded, upper bounded, and lower bounded).
 */
public class GenericsWithCollections
{

	// Generic method to print any collection
	public static <T> void printCollection(Collection<T> collection)
	{
		for (T item : collection)
		{
			System.out.print(item + " ");
		}
		System.out.println();
	}

	// Method using unbounded wildcard
	public static void printList(List<?> list)
	{
		for (Object item : list)
		{
			System.out.print(item + " ");
		}
		System.out.println();
	}

	// Method using upper bounded wildcard
	public static void sumNumbers(List<? extends Number> numbers)
	{
		double sum = 0;
		for (Number num : numbers)
		{
			sum += num.doubleValue();
		}
		System.out.println("Sum: " + sum);
	}

	// Method using lower bounded wildcard
	public static void addIntegers(List<? super Integer> list)
	{
		list.add(100);
		list.add(200);
		System.out.println("After adding integers: " + list);
	}

	public static void main(String[] args)
	{
		// 1. Type-safe collection
		List<String> stringList = new ArrayList<>();
		stringList.add("Geeks");
		stringList.add("for");
		stringList.add("Geeks");

		// 2. Generic method
		System.out.print("Generic method output: ");
		printCollection(stringList);

		// 3. Unbounded wildcard
		List<Integer> intList = Arrays.asList(1, 2, 3);
		System.out.print("Unbounded wildcard output: ");
		printList(intList);

		// 4. Upper bounded wildcard
		List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
		System.out.print("Upper bounded wildcard output: ");
		sumNumbers(doubleList);

		// 5. Lower bounded wildcard
		List<Number> numberList = new ArrayList<>();
		addIntegers(numberList);
	}
}