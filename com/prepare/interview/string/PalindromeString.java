package com.prepare.interview.string;

import java.util.Scanner;

/**
 * This program checks if a given string is a palindrome.
 * Problem Statement: A palindrome is a word, phrase, or sequence that reads the same backward as forward, ignoring spaces, punctuation, and case. For example, "A man a plan a canal Panama" is a palindrome.
 */
public class PalindromeString
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		// Remove spaces and convert the string to lowercase for accurate comparison.
		String cleaned = input.replaceAll("\\s+", "").toLowerCase();

		boolean isPalindrome = true;
		int length = cleaned.length();

		// Iterate through the first half of the string to compare characters.
		for (int i = 0; i < length / 2; i++)
		{
			// Compare characters from the start and end of the string.
			if (cleaned.charAt(i) != cleaned.charAt(length - 1 - i))
			{
				// If characters do not match, set the flag to false and break the loop.
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome)
		{
			System.out.println("The string is a palindrome.");
		}
		else
		{
			System.out.println("The string is not a palindrome.");
		}
	}
}