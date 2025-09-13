package com.prepare.interview.array;

/**
 * Write a Java program to find the largest number in an array.
 * This program assumes that the array is not empty.
 */
public class FindLargestInArray
{
	public static void main(String[] args)
	{
		// Given array (modify values as needed)
		int[] arr = {12, 45, 7, 89, 34, 22};

		// Assume first element is the largest
		int largest = arr[0];

		// Traverse the array to find the largest element
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] > largest)
			{
				largest = arr[i];
			}
		}

		// Output the largest element
		System.out.println("The largest number in the array is: " + largest);
	}
}