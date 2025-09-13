package com.misc;

/*
 * UnicodeExample.java
 * This program demonstrates how to print the Unicode values of uppercase and lowercase letters in both decimal and hexadecimal formats.
 */
public class UnicodeExample
{
	public static void main(String[] args)
	{
		// Uppercase letters
		for (char ch = 'A'; ch <= 'Z'; ch++)
		{
			System.out.println("Character: " + ch + ", Unicode (decimal): " + (int) ch + ", Unicode (hex): \\u" + Integer.toHexString(ch).toUpperCase());
		}

		System.out.println("\n"); // Separator

		// Lowercase letters
		for (char ch = 'a'; ch <= 'z'; ch++)
		{
			System.out.println("Character: " + ch + ", Unicode (decimal): " + (int) ch + ", Unicode (hex): \\u" + Integer.toHexString(ch).toUpperCase());
		}
	}
}