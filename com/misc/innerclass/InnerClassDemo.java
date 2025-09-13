package com.misc.innerclass;

/** * This Java program demonstrates the concept of inner classes.
 * It includes a static block in both the outer and inner classes,
 * constructors for both classes, and methods to showcase their functionality.
 * The main method creates an instance of the inner class and calls its methods.
 */

//outer class
class InnerClassDemo
{
	// Static block of outer class
	static
	{
		System.out.println("In a static block of Outer class");
	}

	// Outer class constructor
	public InnerClassDemo()
	{
		System.out.println("In an outer class constructor");
	}

	public static void OuterStaticMethod()
	{
		System.out.println("In a static method of Outer class");
	}

	// Simple nested inner class
	class Inner
	{
		public Inner()
		{
			System.out.println("In a Inner class constructor");
		}

		static
		{
			System.out.println("In a static block of Inner class");
		}

		// show() method of inner class
		public void show()
		{

			System.out.println("In a Inner class show method");
		}

		public static void innerStaticMethod()
		{
			System.out.println("In a static method of Inner class");
		}

	}
}

// Class 2 - Main class
class InnerClassMain
{

	// Main driver method
	public static void main(String[] args)
	{

		// Note how inner class object is created inside main()
		InnerClassDemo.Inner in = new InnerClassDemo().new Inner();

		// Calling show() method over above object created
		in.show();

		// Calling static method of inner class
		InnerClassDemo.Inner.innerStaticMethod();

		// Calling static method of outer class
		InnerClassDemo.OuterStaticMethod();
	}
}