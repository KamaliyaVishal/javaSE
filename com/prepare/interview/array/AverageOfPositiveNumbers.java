package com.prepare.interview.array;
/**
 * Write a Java program to calculate the average of all positive numbers in an array.
 * This program assumes that the array is not empty and handles cases where there are no positive numbers.
 */
public class AverageOfPositiveNumbers
{
	public static void main(String[] args)
	{
		// Given array (modify as needed)
        int[] arr = {92, 2, 74, 55, 0, 10, -60, 24, 91, -67, 11};

		int sum = 0;
		int count = 0;

		// Traverse the array to sum only positive numbers
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] >= 0)
			{
				sum += arr[i];
				count++;
			}
		}

		double average;
		if (count > 0)
		{
			average = (double) sum / count;
			System.out.println("Average of positive numbers: " + average);
		}
		else
		{
			average = 0.0;
			System.out.println("No positive numbers in the array. Average: " + average);
		}
	}
}