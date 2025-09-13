package com.prepare.interview.array;

/**
 * Write a Java program to calculate the sum of all elements in an array. This program assumes that the array is not empty.
 */
public class SumOfArrayElements
{
	public static void main(String[] args)
	{
		// Given array (you can modify the values)
		int[] arr = {92, 2, 74, 55, 0, 10, -60, 24, 91, -67, 11};

		int sum = 0;

		// Traverse the array and add each element to sum
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}

		// Output the sum
		System.out.println("The sum of all array elements is: " + sum);
	}
}