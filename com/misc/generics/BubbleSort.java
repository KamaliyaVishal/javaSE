package com.misc.generics;

/**
 * Generic Bubble Sort Example This class demonstrates a generic bubble sort algorithm that can sort arrays of any type that implements the Comparable interface.
 * It sorts Integer, Character, and String arrays.
 */

/**
 * Notes on Generics with Comparable:
 *
 * 1. The generic constraint <T extends Comparable<T>> ensures that any type used
 *    with this method must implement the Comparable interface, which provides
 *    the compareTo() method.
 *
 * 2. When we call arr[j].compareTo(arr[j+1]), we're not calling the interface
 *    method directly, but the concrete implementation provided by classes like
 *    Integer, String, or Character.
 *
 * 3. We don't need @Override here because we're not implementing the method,
 *    just using it on objects that are guaranteed to have it.
 *
 * 4. If custom comparison logic is needed instead of using Comparable's natural
 *    ordering, consider using a Comparator parameter:
 *    public static <T> void sort_generics(T[] arr, Comparator<T> comparator)
 */
public class BubbleSort
{

	public static void main(String[] args)
	{
		Integer[] a = {100, 22, 58, 41, 6, 50};

		Character[] c = {'v', 'g', 'a', 'c', 'x', 'd', 't'};

		String[] s = {"Amiya", "Kuna", "Gudly", "Sweta", "Mama", "Rani", "Kandhei"};

		System.out.print("Sorted Integer array:  ");
		sort_generics(a);

		System.out.print("Sorted Character array:  ");
		sort_generics(c);

		System.out.print("Sorted String array:  ");
		sort_generics(s);
	}

	public static <anyTypeOfArr extends Comparable<anyTypeOfArr>> void sort_generics(anyTypeOfArr[] arr)
	{
		//As we are comparing the Non-primitive data types we need to use Comparable class
		//Bubble Sort logic
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if (arr[j].compareTo(arr[j + 1]) > 0)
				{
					swap(j, j + 1, arr);
				}
			}
		}
		// Printing the elements after sorted
		for (anyTypeOfArr i : arr)
		{
			System.out.print(i + ", ");
		}
		System.out.println();

	}

	public static <T> void swap(int i, int j, T[] a)
	{
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}