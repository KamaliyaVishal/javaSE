package com.misc;

class SuperClass
{
	// This is a super class
	public  static  void display()
	{
		System.out.println("This is a method in the super class.");
	}
}

class SubClass extends SuperClass
{
	// This is a sub class
	public static void display()
	{
		System.out.println("This is a method in the sub class.");
	}
}

public class StaticMethod
{


	public static void main(String[] args)
	{
		// Static method call
		printMessage("Hi, this is a static method call!");

		StaticMethod.printMessage("Hi, this is another static method call!");

		//calling static method from super class
		SuperClass.display();

		//calling static method from sub class
		SubClass.display();

		//calling static method from sub class using super class reference
		SuperClass superClass = new SubClass();
		superClass.display(); // This will call the method in the super class, not the

		// sub class, because static methods are not polymorphic.
		SubClass subClass = new SubClass();
		subClass.display(); // This will call the method in the sub class.

	}

	private static void printMessage(String message)
	{
		System.out.println(message);
	}
}
