package com.misc.Interface;

import java.io.*;         // For Serializable
import java.rmi.Remote;   // For Remote
import java.rmi.RemoteException;

/**
 * This class demonstrates the use of marker interfaces in Java.
 * It includes examples of Serializable, Cloneable, and Remote interfaces.
 *
 * Serializable: Used to indicate that a class can be serialized.
 * Cloneable: Used to indicate that a class allows cloning of its objects.
 * Remote: Used in RMI (Remote Method Invocation) to indicate that an object can be accessed remotely.
 */

// 1. Serializable Example
class Person implements Serializable
{
	int id;
	String name;

	public Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

// 2. Cloneable Example
class Animal implements Cloneable
{
	String type;

	public Animal(String type)
	{
		this.type = type;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

// 3. Remote Example
// Remote is a marker interface in java.rmi
interface MyRemoteService extends Remote
{
	// In real RMI, methods would throw RemoteException
	void sayHello() throws RemoteException;
}

// Implementation of the remote interface
class RemoteServiceImpl implements MyRemoteService
{
	public void sayHello() throws RemoteException
	{
		System.out.println("Hello from Remote Service!");
	}
}

public class AllMarkerInterfaceDemo
{
	public static void main(String[] args)
	{
		// Serializable Demo
		try
		{
			Person p1 = new Person(101, "Alice");
			// Serialize
			FileOutputStream fos = new FileOutputStream("person.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.close();

			// Deserialize
			FileInputStream fis = new FileInputStream("person.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person p2 = (Person) ois.readObject();
			ois.close();

			System.out.println("Serializable Demo: " + p2.id + " " + p2.name);
		}
		catch (Exception e)
		{
			System.out.println("Serializable error: " + e);
		}

		// Cloneable Demo
		try
		{
			Animal a1 = new Animal("Dog");
			Animal a2 = (Animal) a1.clone();
			System.out.println("Cloneable Demo: " + a2.type);
		}
		catch (CloneNotSupportedException e)
		{
			System.out.println("Cloneable error: " + e);
		}

		// Remote Demo
		try
		{
			MyRemoteService remoteObj = new RemoteServiceImpl();
			remoteObj.sayHello();
			if (remoteObj instanceof Remote)
			{
				System.out.println("Remote Demo: Object is marked as Remote");
			}
			else
			{
				System.out.println("Remote Demo: Object is NOT marked as Remote");
			}
		}
		catch (RemoteException e)
		{
			System.out.println("Remote error: " + e);
		}
	}
}