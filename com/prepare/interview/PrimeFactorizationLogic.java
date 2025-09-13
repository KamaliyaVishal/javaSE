package com.prepare.interview;

/**
 * PrintPrimeFactorization class is a placeholder for a program that would compute and print the prime factorization of a given number.
 * The implementation details are not provided in this snippet.
 */
public class PrimeFactorizationLogic
{
	public static void main(String[] args)
	{
		printPrimeFactors(100);
	}

	private static void printPrimeFactors(int number)
	{
		for (int i = 2; i < number; i++)
		{
			while (number % i == 0)
			{
				System.out.print(i + " ");
				number = number/i;
			}
		}
	}
}
