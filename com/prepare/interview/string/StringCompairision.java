package com.prepare.interview.string;

public class StringCompairision
{
	public static void main(String[] args)
	{
		String str = "Hello, World!";
		String st2r = "Hello, World!";

		System.out.println(str == st2r); // true, because both refer to the same string literal in the string pool
		System.out.println(str.equals(st2r)); // true, because the content of both strings is the same
	}
}
