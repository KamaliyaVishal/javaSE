package com.misc.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Generic Unbounded Wildcard Example
 *
 * This class demonstrates the use of unbounded wildcards in generics.
 * It defines a method that can accept a list of any type, allowing for flexibility
 * in the types of objects processed.
 */
class GenericUnboundedWildcarDemo
{
	public static void main(String[] args)
	{

		// Integer List
		List<Integer> list1 = Arrays.asList(1, 2, 3);

		// Double list
		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);

		printlist(list1);

		printlist(list2);
	}

	private static void printlist(List<?> list)
	{

		System.out.println(list);
	}
}