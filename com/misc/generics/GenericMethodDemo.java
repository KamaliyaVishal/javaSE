package com.misc.generics;

/**
 * Generic Method Example
 *
 * This class demonstrates a generic method that can accept any type of argument.
 * It prints the class name and value of the passed argument
 *
 * It also includes a method that accepts an Object parameter to show the difference in type handling.
 * The generic method can handle any type, while the Object parameter method can only handle Object types
 * and will require casting if specific type behavior is needed
 */

class GenericMethodDemo
{

	// A Generic method example
	static <Type> void genericDisplay(Type obj)
	{
		// Print the class name and value of the passed argument
		System.out.println("Class Name: " + obj.getClass().getName());
		System.out.println("Value: " + obj);
	}

	static void ObjectParameterMethod(Object obj)
	{
		// Print the class name and value of the passed argument
		System.out.println("Class Name: " + obj.getClass().getName());
		System.out.println("Value: " + obj);
	}

	public static void main(String[] args)
	{
		// Calling generic method with Integer argument
		genericDisplay(11);

		// Calling generic method with String argument
		genericDisplay("GeeksForGeeks");

		// Calling generic method with double argument
		genericDisplay(1.0);

        //calling object parameter method
        ObjectParameterMethod("GeeksForGeeks");
        ObjectParameterMethod(11);
        ObjectParameterMethod(1.0);
	}
}