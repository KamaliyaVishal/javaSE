package com.misc.arrays;

import java.util.Arrays;

public class ArratTest
{
	int[]  intArray = new int[10];
	// This is a simple Java program to demonstrate the use of an array.

	int[] intArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

	char[] charArray2 = new char[10];

	String[] stringArray = {
		"Hello", "World", "This", "Is", "An", "Array", "Of", "Strings"
	};

	boolean[] booleanArray = {true, false, true, false, true};

	Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

	float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

	byte[] byteArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	short[] shortArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	long[] longArray = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L};

	char[][] char2DArray = {
		{'a', 'b', 'c'},
		{'d', 'e', 'f'},
		{'g', 'h', 'i'}
	};

	char[][][] char3DArray = {
		{
			{'a', 'b'},
			{'c', 'd'}
		},
		{
			{'e', 'f'},
			{'g', 'h'}
		}
	};

	char [][][] char3DArray2 = new char[2][2][2];



	public static void main(String[] args)
	{
		ArratTest at = new ArratTest();
		at.intArray[0] = 1;
		at.intArray[1] = 2;
		at.intArray[2] = 3;
		at.intArray[3] = 4;
		at.intArray[4] = 5;
		at.intArray[5] = 6;
		at.intArray[6] = 7;
		at.intArray[7] = 8;
		at.intArray[8] = 9;
		at.intArray[9] = 10;

		for (int i : at.intArray)
			System.out.print(i + " ");
		System.out.println();

		System.out.println(Arrays.toString(at.intArray2));

		System.out.println(Arrays.toString(at.charArray));
		System.out.println(Arrays.toString(at.charArray2));
		System.out.println(Arrays.toString(at.stringArray));
		System.out.println(Arrays.toString(at.booleanArray));
		System.out.println(Arrays.toString(at.doubleArray));
		System.out.println(Arrays.toString(at.floatArray));
		System.out.println(Arrays.toString(at.byteArray));
		System.out.println(Arrays.toString(at.shortArray));
		System.out.println(Arrays.toString(at.longArray));
		System.out.println(Arrays.deepToString(at.char2DArray));
		System.out.println(Arrays.deepToString(at.char3DArray));
		System.out.println(Arrays.deepToString(at.char3DArray2));
	}


}
