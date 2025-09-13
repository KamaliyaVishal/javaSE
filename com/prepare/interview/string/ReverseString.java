package com.prepare.interview.string;

import java.util.Scanner;

/**
 * This program reverses a given string using two different methods: 1. Using a loop to build the reversed string character by character. 2. Using StringBuilder's reverse method.
 */
public class ReverseString
{
	/**
	 * The main method to execute the program.
	 *
	 * @param args Command-line arguments (not used in this program).
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		// Method 1: Using a loop to reverse the string.
		String reversed = "";
		// Iterate through the input string from the last character to the first.
		for (int i = input.length() - 1; i >= 0; i--)
		{
			reversed += input.charAt(i);
		}
		System.out.println("Reversed string (using loop): " + reversed);

		// Method 2: Using StringBuilder to reverse the string.
		StringBuilder sb = new StringBuilder(input);
		System.out.println("Reversed string (using StringBuilder): " + sb.reverse().toString());


		// Method 3: Using a character array to reverse the string.
		// Initialize an array of characters with the same length as the input string.
		int last = input.length();
		char[] ch = new char[input.length()];
		int index = 0;

		for (int i = last - 1; i >= 0; i--)
		{
			ch[index] = input.charAt(i);
			index++;
		}
		String rs = new String(ch);
		System.out.println("Reversed string (using character array)" + rs);

	}
}