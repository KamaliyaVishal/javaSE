package com.prepare.interview.string;

/**
 * This program demonstrates various string operations in Java.
 * Problem Statement: Perform and showcase different string manipulations such as comparison, substring extraction, case conversion, and concatenation.
 */
public class StringOperation
{
	/**
	 * The main method to execute the program.
	 *
	 * @param args Command-line arguments (not used in this program).
	 */
	public static void main(String[] args)
	{
		String s = "hello, World!";

		// Compare the string with another string and print the result.
		// The compareTo method compares two strings lexicographically.
		System.out.println(s.compareTo("hello, Java!"));

		// Extract a substring from index 1 to 4 (exclusive) and print it.
		System.out.println(s.substring(1, 4));

		// Extract a substring from index 1 to the second last character and print it.
		System.out.println(s.substring(1, s.length() - 1));

		// Convert the string to uppercase and print it.
		System.out.println(s.toUpperCase());

		// Extract the first character as a substring.
		String s0 = s.substring(0, 1);

		// Extract the rest of the string starting from the second character.
		String s1 = s.substring(1, s.length());

		// Convert the first character to uppercase, concatenate it with the rest of the string,
		// and print the result.
		System.out.println(s0.toUpperCase().concat(s1));
	}
}