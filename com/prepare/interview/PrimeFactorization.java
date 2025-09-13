package com.prepare.interview;

import java.util.Scanner;

/**
 * PrintPrimeFactorization class is a placeholder for a program that would compute and print the prime factorization of a given number. The implementation details are not provided in this snippet.
 */
public class PrimeFactorization
{
	public static void main(String[] args)
	{
		// Placeholder for the main method where the prime factorization logic would be implemented.
		// For example, you could read an integer input and print its prime factors.
		//use Scanner or any other method to get input from the user.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find its prime factorization:");
		int number = scanner.nextInt();
		scanner.close(); // Close the scanner to prevent resource leaks

 		System.out.println("Prime factorization of " + number + ":");
		printPrimeFactors(number);
	}

	private static void printPrimeFactors(int number)
	{
		// This method would contain the logic to compute and print the prime factors of the given number.
		// For simplicity, we will just print a placeholder message.
		if (number <= 1)
		{
			System.out.println("No prime factors for numbers less than or equal to 1.");
			return;
		}

		System.out.print("Prime factors: ");
		// Loop through all possible factors starting from 2
		// and divide the number by each factor until it becomes 1.
		for (int i = 2; i <= number; i++)
		{
			// Check if i is a factor of number
			// If it is, print it and divide number by i until it is no longer
			while (number % i == 0)
			{
				System.out.print(i + " ");
				number /= i;
			}
		}
		System.out.println(); // New line after printing all prime factors
	}
}
