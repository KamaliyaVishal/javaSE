package com.prepare.interview.string;

/**
 * This program checks if a given string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same backward as forward, ignoring spaces, punctuation, and case.
 */

public class PalindromeLogic
{
	public static void main(String[] args)
	{
		String test1 = "A man, a plan, a canal: Panama";
		String test2 = "race a car";
		String test3 = "madam";

		System.out.println("\"" + test1 + "\" is palindrome? " + isPalindrome(test1)); // true
		System.out.println("\"" + test2 + "\" is palindrome? " + isPalindrome(test2)); // false
		System.out.println("\"" + test3 + "\" is palindrome? " + isPalindrome(test3)); // true
	}

	public static boolean isPalindrome(String s)
	{
		// Remove non-alphanumeric characters and convert to lower case
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int mid = s1.length() / 2;
		int last = s1.length() - 1;

		for (int i = 0; i < mid; i++)
		{
			if (s1.charAt(i) != s1.charAt(last))
			{
				return false;
			}
			last--;
		}
		return true;
	}
}