package com.misc;// Java program to demonstrate the use of instance method

class Test
{
	String n = "";

	// Instance method
	public void test(String n)
	{
		this.n = n;
	}
}

public class InstanceMethod
{
	public static void main(String[] args)
	{

		// create an instance of the class
		Test t = new Test();
		// calling an instance method in the class 'Geeks'
		t.test("GeeksforGeeks");
		System.out.println(t.n);
	}
}

// User function Template for Java

// Write the helloFunction below. It should have one statement
// System.out.println("Hello")


