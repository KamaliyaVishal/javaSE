package com.misc.oops;

interface MyInterface
{
	// Abstract method (must be implemented by classes)
	void abstractMethod();

	// Default method (provides a default implementation)
	default void defaultMethod()
	{
		System.out.println("This is a default method in the interface.");
	}

	// Static method (belongs to the interface, not to instances)
	static void staticMethod()
	{
		System.out.println("This is a static method in the interface.");
	}
}

class MyClass implements MyInterface
{
	@Override
	public void abstractMethod()
	{
		System.out.println("Implementation of abstract method.");
	}
}

public class InterfaceDemo
{
	public static void main(String[] args)
	{
		MyClass obj = new MyClass();
		obj.abstractMethod();      // Calls implemented abstract method
		obj.defaultMethod();       // Calls default method from interface

		MyInterface.staticMethod(); // Calls static method from interface
	}
}