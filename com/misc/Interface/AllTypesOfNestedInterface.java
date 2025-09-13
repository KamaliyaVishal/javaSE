package com.misc.Interface;

/** * This class demonstrates various types of nested interfaces in Java:
 * 1. Public nested interface
 * 2. Protected nested interface
 * 3. Default (package-private) nested interface
 * 4. Private nested interface
 * 5. Nested interface inside another interface
 */
public class AllTypesOfNestedInterface
{

	// 1. Interface nested inside a class (public)
	public interface PublicNested
	{
		void publicNestedMethod();
	}

	// 2. Interface nested inside a class (protected)
	protected interface ProtectedNested
	{
		void protectedNestedMethod();
	}

	// 3. Interface nested inside a class (package-private/default)
	interface DefaultNested
	{
		void defaultNestedMethod();
	}

	// 4. Interface nested inside a class (private)
	private interface PrivateNested
	{
		void privateNestedMethod();
	}

	// 5. Interface nested inside another interface (always public static)
	public interface OuterInterface
	{
		interface InnerInterface
		{
			void innerMethod();
		}
	}

	// Implementations

	// Implement public nested interface
	static class PublicNestedImpl implements PublicNested
	{
		public void publicNestedMethod()
		{
			System.out.println("Public nested interface method");
		}
	}

	// Implement protected nested interface
	static class ProtectedNestedImpl implements ProtectedNested
	{
		public void protectedNestedMethod()
		{
			System.out.println("Protected nested interface method");
		}
	}

	// Implement default/package-private nested interface
	static class DefaultNestedImpl implements DefaultNested
	{
		public void defaultNestedMethod()
		{
			System.out.println("Default/package-private nested interface method");
		}
	}

	// Implement private nested interface (can only be used inside the outer class)
	static class PrivateNestedImpl implements PrivateNested
	{
		public void privateNestedMethod()
		{
			System.out.println("Private nested interface method");
		}
	}

	// Implement nested interface inside another interface
	static class InnerInterfaceImpl implements OuterInterface.InnerInterface
	{
		public void innerMethod()
		{
			System.out.println("Nested interface inside another interface method");
		}
	}

	public static void main(String[] args)
	{
		// Using public nested interface
		PublicNested publicObj = new PublicNestedImpl();
		publicObj.publicNestedMethod();

		// Using protected nested interface
		ProtectedNested protectedObj = new ProtectedNestedImpl();
		protectedObj.protectedNestedMethod();

		// Using default/package-private nested interface
		DefaultNested defaultObj = new DefaultNestedImpl();
		defaultObj.defaultNestedMethod();

		// Using private nested interface (only accessible within this class)
		PrivateNested privateObj = new PrivateNestedImpl();
		privateObj.privateNestedMethod();

		// Using interface nested inside another interface
		OuterInterface.InnerInterface innerObj = new InnerInterfaceImpl();
		innerObj.innerMethod();

		// Anonymous inner class implementation for nested interface
		PublicNested anonObj = new PublicNested()
		{
			public void publicNestedMethod()
			{
				System.out.println("Anonymous class for public nested interface");
			}
		};
		anonObj.publicNestedMethod();
	}
}