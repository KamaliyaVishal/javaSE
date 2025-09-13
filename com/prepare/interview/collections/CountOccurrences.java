package com.prepare.interview.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Count Occurrences of Elements in an Array
 *
 * This class demonstrates how to count the occurrences of each element in an array
 * using a HashMap. It iterates through the array, updating the count for each element,
 * and finally prints the frequency of each element.
 */
public class CountOccurrences
{
	public static void main(String[] args)
	{

		int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 1};
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : arr)
		{
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		System.out.println("Element Occurrences: " + frequencyMap);

	}
}
