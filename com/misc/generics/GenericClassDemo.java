package com.misc.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple demonstration of a generic class in Java.
 * This class can hold any type of value, such as String, Integer, or even a List of int arrays.
 */
class GenericClassDemo<T>
{
	T value;
}

class GenericClass
{
	public static void main(String[] args)
	{
		GenericClassDemo<String> stringGeneric = new GenericClassDemo<>();
		stringGeneric.value = "Hello, Generics!";
		System.out.println("String value: " + stringGeneric.value);

		GenericClassDemo<Integer> integerGeneric = new GenericClassDemo<>();
		integerGeneric.value = 42;
		System.out.println("Integer value: " + integerGeneric.value);

		GenericClassDemo<List<int[]>> listGeneric = new GenericClassDemo<>();
		List<int[]> intList = new ArrayList<>();
		intList.add(new int[] {1, 2, 3});
		listGeneric.value = intList;
		//Iterate through the list of int arrays
		for (int[] arr : listGeneric.value)
			System.out.println(Arrays.toString(arr));

	}
}