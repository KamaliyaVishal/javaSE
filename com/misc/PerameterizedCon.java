package com.misc;// Java Program for Parameterized Constructor

class PerameterizedCon
{

	// data members of the class
	String name;
	int id;

	PerameterizedCon(String name, int id)
	{
		this.name = name;
		this.id = id;
		return; // This return is optional
	}
}

class Constructor
{
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor
		PerameterizedCon geek1 = new PerameterizedCon("Sweta", 68);
		System.out.println("GeekName: " + geek1.name
				+ " and GeekId: " + geek1.id);
	}
}