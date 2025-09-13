package com.misc.Interface;

interface MyInterface
{
	void display();

	default void show()
	{
		System.out.println("Default method in interface");
	}
}

class MyClass implements MyInterface
{
	@Override
	public void display()
	{
		System.out.println("Display method in MyClass");
	}
	// No override of show()
}

public class InterfaceDemo
{
	public static void main(String[] args)
	{
		MyClass obj = new MyClass();
		obj.show(); // This works, as show() is inherited from MyInterface'
		obj.display();

        MyInterface obj2 = new MyClass();
        obj2.show(); // This also works, as obj2 is of type MyInterface
		obj2.display(); // Calls the display method of MyClass
	}
}