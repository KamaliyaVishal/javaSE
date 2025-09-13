package com.misc;

import java.io.*;

class StudentForObj implements Serializable
{
	private String name;

	public StudentForObj(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Student: " + name;
	}
}

public class ObjectInitialization
{
	public static void main(String[] args)
	{
		// Serialization
		try (ObjectOutputStream out
				= new ObjectOutputStream(
				new FileOutputStream("student.ser")))
		{
			out.writeObject(new StudentForObj("Alice"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		// Deserialization
		try (ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("student.ser")))
		{
			StudentForObj s = (StudentForObj) in.readObject();
			System.out.println(s); // Output: Student: Alice
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}