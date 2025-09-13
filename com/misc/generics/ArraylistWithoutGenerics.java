package com.misc.generics;

import java.util.ArrayList;

/**
 * ArrayList Without Generics Example
 *
 * This class demonstrates the use of an ArrayList without generics.
 * It shows that an ArrayList can hold elements of different types,
 * but this approach lacks type safety and can lead to runtime errors.
 */
public class ArraylistWithoutGenerics
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add("2");
		arrayList.add(3.0);
		arrayList.add(true);
		arrayList.add('c');
		arrayList.add(new Object());
		arrayList.add("String");

		System.out.println(arrayList);
	}
}
