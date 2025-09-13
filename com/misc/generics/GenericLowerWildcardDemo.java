package com.misc.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Generic Upper Bounded Wildcard Example
 *
 * This class demonstrates the use of upper bounded wildcards in generics.
 * It defines a method that can accept a list of any type that extends Number,
 * allowing for flexibility in the types of numbers processed.
 */
class GenericLowerWildcardDemo
{
	public static void main(String[] args)
	{
		// Lower Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list1);

		// Number list
		List<Number> list2 = Arrays.asList(4, 5, 6, 7);

		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list2);
	}

	public static void printOnlyIntegerClassorSuperClass(
			List<? super Integer> list)
	{
		System.out.println(list);
	}
}