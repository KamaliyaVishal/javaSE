package com.prepare.interview.array;

/**
 * * CheckSortedArray class checks if a given array is sorted in ascending order.
 * It iterates through the array and compares each element with the next one.
 * If any element is greater than the next, it concludes that the array is not sorted.
 */
public class CheckSortedArray
{
	public static void main(String[] args)
	{
		// Given array (modify this array as needed)
		int[] arr = {2, 5, 8, 12, 19};

		// Check if array is sorted in ascending order
		boolean isSorted = true;
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i] > arr[i + 1])
			{
				isSorted = false;
				break;
			}
		}

		// Output result
		if (isSorted)
		{
			System.out.println("The array is sorted in ascending order.");
		}
		else
		{
			System.out.println("The array is NOT sorted in ascending order.");
		}
	}
}