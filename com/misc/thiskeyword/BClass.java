package com.misc.thiskeyword;// Java program covering all main uses of "this" keyword

/** * This class demonstrates various uses of the "this" keyword in Java.
 * 1. Referring to current class instance variables.
 * 2. Invoking current class constructor
 * 3. Returning the current class instance.
 * 4. Passing the current class instance as a method parameter.
 * 5. Invoking the current class method.
 * 6. Using "this" as an argument in constructor call.
 */
class DemoClass // Renamed from BClass
{
	int x = 5;

	// Method to show value of x
	void display()
	{
		System.out.println("Value of x in Class DemoClass: " + x); // Updated class name in output
	}
}

class ThisKeywordExample
{
	int a;
	int b;
	DemoClass objB; // Renamed type

	// 1. Using "this" to refer to current class instance variables
	ThisKeywordExample(int a, int b)
	{
		this.a = a; // differentiates instance variable from parameter
		this.b = b;
	}

	// 2. Using this() to invoke current class constructor (constructor chaining)
	ThisKeywordExample()
	{
		this(10, 20); // calls parameterized constructor
		System.out.println("Inside default constructor");
	}

	// 3. Using "this" to return the current class instance
	ThisKeywordExample getInstance()
	{
		return this;
	}

	// 4. Using "this" as a method parameter
	void showInstance(ThisKeywordExample obj)
	{
		System.out.println("showInstance: a = " + obj.a + ", b = " + obj.b);
	}

	void callShowInstance()
	{
		showInstance(this); // passes current object as parameter
	}

	// 5. Using "this" to invoke the current class method
	void display()
	{
		this.printDetails(); // calls another method in the same class
	}

	void printDetails()
	{
		System.out.println("printDetails: a = " + a + ", b = " + b);
	}

	// 6. Using "this" as an argument in constructor call
	ThisKeywordExample(DemoClass objB) // Renamed parameter type
	{
		this(); // calls default constructor
		this.objB = objB;
		objB.display();
	}

	public static void main(String[] args)
	{
		// Using "this" to refer to instance variables
		ThisKeywordExample ex1 = new ThisKeywordExample(1, 2);

		// Using this() to invoke constructor
		ThisKeywordExample ex2 = new ThisKeywordExample();

		// Using "this" to return current instance
		ThisKeywordExample ex3 = ex1.getInstance();
		System.out.println("getInstance: a = " + ex3.a + ", b = " + ex3.b);

		// Using "this" as a method parameter
		ex1.callShowInstance();

		// Using "this" to invoke current class method
		ex1.display();

		// Using "this" as an argument in constructor call
		DemoClass bObj = new DemoClass(); // Renamed type
		ThisKeywordExample ex4 = new ThisKeywordExample(bObj);
	}
}