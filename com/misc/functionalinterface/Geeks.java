package com.misc.functionalinterface;

import java.util.function.Function;

public class Geeks
{

	public static void main(String[] args)
	{

        Function<String, Integer> stringLength = (String s) -> s.length();
        System.out.println("Length of 'Hello World': " + stringLength.apply("Hello World"));

		// Using lambda expression to implement Runnable
		new Thread(() -> {
			System.out.println("Thread is running using lambda expression");
		}).start();
	}
}