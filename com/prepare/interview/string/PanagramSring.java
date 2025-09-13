package com.prepare.interview.string;

/**
 * This program checks if a given string is a pangram.
 * Problem Statement: A pangram is a sentence that contains every letter of the English alphabet at least once. For example: "The quick brown fox jumps over the lazy dog" is a pangram.
 */
public class PanagramSring
{
	/**
	 * The main method to execute the program.
	 *
	 * @param args Command-line arguments (not used in this program).
	 */
	public static void main(String[] args)
	{
		String panagram = "The quick brown fox jumps over the lazy dog";

		// Boolean array to mark the presence of each alphabet letter.
		boolean[] mark = new boolean[26];
		int index = 0;

		for (int i = 0; i < panagram.length(); i++)
		{
			char ch = Character.toLowerCase(panagram.charAt(i));
			if (ch >= 'a' && ch <= 'z')
			{
				// Calculate the index in the mark array.
				int charIndex = ch - 'a';
				if (!mark[charIndex])
				{
					mark[charIndex] = true;
					index++;
				}
			}
		}
		System.out.println("Is the string a pangram? " + (index == 26));
	}
}