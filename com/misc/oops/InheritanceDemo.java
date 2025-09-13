package com.misc.oops;

// Parent class
class Animal_InheritanceDemo
{
	void sound()
	{
		System.out.println("Animal makes a sound");
	}
}

// Child class
class Dog_InheritanceDemo extends Animal_InheritanceDemo
{
	void sound()
	{
		System.out.println("Dog barks");
	}
}

// Child class
class Cat_InheritanceDemo extends Animal_InheritanceDemo
{
	void sound()
	{
		System.out.println("Cat meows");
	}
}

// Child class
class Cow_InheritanceDemo extends Animal_InheritanceDemo
{
	void sound()
	{
		System.out.println("Cow moos");
	}
}

// Main class
public class InheritanceDemo
{
	public static void main(String[] args)
	{
		Animal_InheritanceDemo a;
		a = new Dog_InheritanceDemo();
		a.sound();

		a = new Cat_InheritanceDemo();
		a.sound();

		a = new Cow_InheritanceDemo();
		a.sound();
	}
}