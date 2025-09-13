package com.misc;

public class FileIO
{
	public static void main(String[] args)
	{
		// Example of using File I/O in Java
		try {
			java.io.File file = new java.io.File("com/misc/example.txt");
			java.io.FileWriter writer = new java.io.FileWriter(file);
			writer.write("Hello, World!");
			writer.close();

			java.io.FileReader reader = new java.io.FileReader(file);
			int character;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();
		} catch (java.io.IOException e) {
			System.err.println("An error occurred during file I/O: " + e.getMessage());
		}
	}
}
