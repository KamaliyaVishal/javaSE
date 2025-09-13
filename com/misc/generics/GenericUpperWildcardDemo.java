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
class GenericUpperWildcardDemo
{
	public static void main(String[] args)
	{
		// Upper Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		System.out.println("Total sum is:" + sum(list1));

		// Double list
		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

		System.out.print("Total sum is:" + sum(list2));
	}

	private static double sum(List<? extends Number> list)
	{
		double sum = 0.0;
		for (Number i : list)
		{
			sum += i.doubleValue();
		}

		return sum;
	}
}