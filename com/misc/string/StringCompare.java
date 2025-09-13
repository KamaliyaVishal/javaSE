package com.misc.string;

public class StringCompare
{
	public static void main(String[] args)
	{
		String s = "Hello, World!";
		System.out.println(s.compareTo("hello, Java!"));
		System.out.println(s.substring(1, 4));

		System.out.println(s.substring(1, s.length() - 1));

		System.out.println(s.toUpperCase());

		String s0 = s.substring(0, 1);
		String s1 = s.substring(1, s.length());
		System.out.println(s0.toUpperCase().concat(s1));

	}
}