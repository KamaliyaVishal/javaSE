package com.misc.innerclass;

import java.util.Objects;

/**
 * This Java program demonstrates various types of inner classes:
 * 1. Member Inner Class
 * 2. Static Nested Class
 * 3. Method Local Inner Class
 * 4. Anonymous Inner Class (both as a subclass and as an interface implementation)
 */
public class TypesofInnerClasses
{
	private String outerField = "Outer Field";

	// 1. Member Inner Class
	class MemberInner
	{
		void show()
		{
			System.out.println("Member Inner Class: " + outerField);
		}
	}

	// 2. Static Nested Class
	static class StaticNested
	{
		static void display()
		{
			System.out.println("Static Nested Class: Can only access static members of OuterClassDemo");
		}
	}

	void methodWithLocalInnerClass()
	{
		final int localVar = 42; // Effectively final for JDK 8+
		// 3. Method Local Inner Class
		class MethodLocalInner
		{
			void print()
			{
				System.out.println("Method Local Inner Class: localVar = " + localVar);
			}
		}
		MethodLocalInner inner = new MethodLocalInner();
		inner.print();
	}

	public static void main(String[] args)
	{
		Integer sd = 10; // Example of a local variable
		// Outer class instance
		TypesofInnerClasses outer = new TypesofInnerClasses();

		// 1. Member Inner Class
		MemberInner member = outer.new MemberInner();
		member.show();

		// 2. Static Nested Class
		StaticNested.display();

		// 3. Method Local Inner Class
		outer.methodWithLocalInnerClass();

		// 4. Anonymous Inner Class as a subclass
		Demo demo = new Demo()
		{
			@Override
			void show()
			{
				super.show();
				System.out.println("Anonymous Inner Class (Subclass): Overridden show()");
			}
		};
		demo.show();

		// 4. Anonymous Inner Class as an interface implementation
		Hello hello = new Hello()
		{
			public void show()
			{
				System.out.println("Anonymous Inner Class (Interface): show()");
			}
		};
		hello.show();
	}
}

// Helper class for anonymous inner class example
class Demo
{
	void show()
	{
		System.out.println("Demo class show()");
	}
}

// Interface for anonymous inner class example
interface Hello
{
	void show();
}