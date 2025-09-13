package com.misc.Interface;

public class ParentClass
{
	interface NestedInterface
	{
		//abstract method
		void display();

		default void show()
		{
			System.out.println("Default method in nested interface");
		}
	}
}

class ChildClss implements ParentClass.NestedInterface
{
	@Override
	public void display()
	{
		System.out.println("Display method in child class");
	}
}

class NestedMain
{
	public static void main(String[] args)
	{
		ChildClss obj = new ChildClss();
		obj.display(); // Calls the display method of child class
		obj.show(); // Calls the default method from nested interface

		ParentClass.NestedInterface obj2 = new ChildClss();
		obj2.display(); // Calls the display method of child class
		obj2.show();
	}
}
