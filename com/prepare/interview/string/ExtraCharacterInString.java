package com.prepare.interview.string;

/**
 * This program finds the extra character in a string.
 *
 * Problem Statement:
 * Given two strings, s1 and s2, where s2 is a permutation of s1 with one extra character,
 * the program identifies and returns the extra character in s2.
 */
public class ExtraCharacterInString
{
	/**
	 * The main method to execute the program.
	 *
	 * @param args Command-line arguments (not used in this program).
	 */
	public static void main(String[] args)
	{
		// Input strings: s1 is the original string, s2 is the string with one extra character.
		String s1 = "abcde";
		String s2 = "abcdef";

		// Find the extra character in s2 and print the result.
		char extraChar = findExtraCharacter(s1, s2);
		System.out.println("The extra character in s2 is: " + extraChar);
	}

	/**
	 * Finds the extra character in the second string (s2) compared to the first string (s1).
	 *
	 * Approach:
	 * - Calculate the sum of ASCII values of characters in both strings.
	 * - The difference between the sums gives the ASCII value of the extra character.
	 *
	 * @param s1 The original string.
	 * @param s2 The string with one extra character.
	 * @return The extra character in s2.
	 */
	private static char findExtraCharacter(String s1, String s2)
	{
		int sumS1 = 0; // Sum of ASCII values of characters in s1.
		int sumS2 = 0; // Sum of ASCII values of characters in s2.

		// Calculate the sum of ASCII values for s1.
		for (char c : s1.toCharArray())
		{
			sumS1 += c;
		}

		// Calculate the sum of ASCII values for s2.
		for (char c : s2.toCharArray())
		{
			sumS2 += c;
		}

		// Return the extra character by subtracting the sums.
		return (char) (sumS2 - sumS1);
	}
}