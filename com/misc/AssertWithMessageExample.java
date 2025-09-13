package com.misc;

public class AssertWithMessageExample
{
	public static void main(String[] args)
	{
		String name = null;
		// Assert that name is not null, providing a message if it is
		assert name != null : "Name cannot be null.";
		System.out.println("Assertion passed: Name is not null.");
	}
}