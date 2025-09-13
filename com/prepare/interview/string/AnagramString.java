package com.prepare.interview.string;

/**
 * Anagram checking An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. Example: "listen" is an anagram of "silent".
 */
public class AnagramString
{
	// Main method to test the anagram checking functionality
	public static void main(String[] args)
	{
		String str1 = "listen";
		String str2 = "silenk";

		// Check if the two strings are anagrams
		boolean isAnagram = areAnagrams(str1, str2);
		System.out.println("Are the two strings anagrams? " + isAnagram);
	}

	/**
	 * Checks if two strings are anagrams of each other.
	 * Anagrams have the same characters with the same frequency.
	 *
	 * @param str1 First string
	 * @param str2 Second string
	 * @return true if str1 and str2 are anagrams, false otherwise
	 */
	private static boolean areAnagrams(String str1, String str2)
	{
		// If lengths are not equal, they cannot be anagrams
		if (str1.length() != str2.length())
		{
			return false;
		}

		// Array to count frequency of each character (assuming ASCII)
		int[] charCount = new int[256];

		// Increment count for each character in str1
		for (char c : str1.toCharArray())
		{
			charCount[c]++;
		}

		// Decrement count for each character in str2
		for (char c : str2.toCharArray())
		{
			charCount[c]--;
			// If count goes below zero, str2 has an extra character not in str1
			if (charCount[c] < 0)
			{
				return false;
			}
		}

		// If all counts are zero, the strings are anagrams
		return true;
	}
}
