package com.misc.arrays;

import java.util.Scanner;

/**
 * This class demonstrates the use of multi-dimensional arrays in Java.
 * It includes examples of static and dynamic initialization of 2D and 3D arrays,
 * user input for 2D arrays, counting even and odd numbers, and accessing specific elements.
 */
public class MultiDimensionalArrayDemo
{
	public static void main(String[] args)
	{
		// 1. Declaration and Initialization of 2D array (static)
		int[][] arr2D = {{1, 2}, {3, 4}};
		System.out.println("Static 2D array:");
		print2DArray(arr2D);

		// 2. Declaration and Initialization of 3D array (static)
		int[][][] arr3D = {
				{{1, 2}, {3, 4}},
				{{5, 6}, {7, 8}}
		};
		System.out.println("\nStatic 3D array:");
		print3DArray(arr3D);

		// 3. 2D Array with user input
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter number of rows for 2D array: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns for 2D array: ");
		int cols = sc.nextInt();

		int[][] userArr2D = new int[rows][cols];
		System.out.println("Enter elements for 2D array:");
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				userArr2D[i][j] = sc.nextInt();
			}
		}

		System.out.println("User input 2D array:");
		print2DArray(userArr2D);

		// 4. Count even and odd numbers in user input 2D array
		int even = 0, odd = 0;
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				if (userArr2D[i][j] % 2 == 0)
					even++;
				else
					odd++;
			}
		}
		System.out.println("Even numbers: " + even + ", Odd numbers: " + odd);

		// 5. 3D Array with assignment and traversal
		int x = 2, y = 2, z = 2;
		int[][][] userArr3D = new int[x][y][z];
		int value = 1;
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				for (int k = 0; k < z; k++)
				{
					userArr3D[i][j][k] = value++;
				}
			}
		}
		System.out.println("\nAssigned 3D array:");
		print3DArray(userArr3D);

		// 6. Accessing a particular element
		System.out.println("\nAccessing arr2D[1][1]: " + arr2D[1][1]);
		System.out.println("Accessing arr3D[1][0][1]: " + arr3D[1][0][1]);

		sc.close();
	}

	// Utility method to print 2D array
	static void print2DArray(int[][] arr)
	{
		for (int[] row : arr)
		{
			for (int val : row)
			{
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	// Utility method to print 3D array
	static void print3DArray(int[][][] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Block " + i + ":");
			for (int j = 0; j < arr[i].length; j++)
			{
				for (int k = 0; k < arr[i][j].length; k++)
				{
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}