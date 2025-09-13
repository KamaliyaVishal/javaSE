package com.misc;

import static java.lang.System.*;

public class ClassName
{
	// Data members
	// Constructor functions
	// User-defined methods
	public static void main(String[] arguments)
	{
		printSum(1, 2, 3, 4);

	}

	private static void printSum(int... numbers)
	{
		int sum = 0;
		for (int number : numbers)
		{
			out.println("Sum: " + sum +" Number: "+ number);
			sum += number;
			out.println("Sum: " + sum);
		}
		out.println("Sum: " + sum);
	}
}
