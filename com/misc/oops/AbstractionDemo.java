package com.misc.oops;

// Abstract Class declared
abstract class Animal_AbstractionDemo
{
	private String name;

	public Animal_AbstractionDemo(String name)
	{
		this.name = name;
	}

	public abstract void makeSound();

	public String getName()
	{
		return name;
	}
}

// Abstracted class
class Dog_AbstractionDemo extends Animal_AbstractionDemo
{
	public Dog_AbstractionDemo(String name)
	{
		super(name);
	}

	public void makeSound()
	{
		System.out.println(getName() + " barks");
	}
}

// Abstracted class
class Cat_AbstractionDemo extends Animal_AbstractionDemo
{
	public Cat_AbstractionDemo(String name)
	{
		super(name);
	}

	public void makeSound()
	{
		System.out.println(getName() + " meows");
	}
}

// Driver Class
public class AbstractionDemo
{

	// Main Function
	public static void main(String[] args)
	{
		Animal_AbstractionDemo myDog = new Dog_AbstractionDemo("ABC");
		Animal_AbstractionDemo myCat = new Cat_AbstractionDemo("XYZ");

		myDog.makeSound();
		myCat.makeSound();
	}
}