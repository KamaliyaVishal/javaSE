package com.prepare.interview.patterns;

import java.util.*;

/**
 * Write a Java program to print a square pattern of stars with spaces in the middle.
*/
public class PrintSquarePattern
{
	public static void main(String[] args)
	{
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the square pattern:");
		// Read the size of the square pattern from user input
		int num = sc.nextInt();

		//outer for loop for number of rows
		for (int i = 0; i < num; i++)
		{
			//inner for loop for number of columns
			for (int j = 0; j < num; j++)
			{
				if (i > 0 && j > 0 && i != num - 1 && j != num - 1)
                {
                    // Print space for the inner part of the pattern
                    System.out.print("  ");
                    continue;
                }
				System.out.print("* ");
			}
			// Move to the next line after printing all columns
			System.out.println();
		}

	}
}