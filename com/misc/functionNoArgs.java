package com.misc;

import java.util.Scanner;

import static com.misc.functionNoArgs.FirstDigit.firstDigit;

public class functionNoArgs
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find its first digit:");
		int number = scanner.nextInt();
		System.out.println(firstDigit(number));
	}

	public static void helloFunction()
	{
		System.out.println("Hello");
	}

	static class FirstDigit
	{
		public static int firstDigit(int n)
		{
			// code here
			return (n < 0) ? -1 : Integer.parseInt(Integer.toString(n).substring(0, 1));
		}
	}
}
