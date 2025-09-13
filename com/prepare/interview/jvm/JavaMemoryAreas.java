package com.prepare.interview.jvm;


/**
 * Demonstrates JVM Memory Areas:
 *
 * JVM Memory Area         Example in Code
 * -----------------------------------------------
 * Method Area             static int staticVar
 * Heap                    MemoryDemo obj = new MemoryDemo(); and int instanceVar
 * Stack                   int localVar, method parameter int param, and args
 * Program Counter Reg.    JVM internally tracks current instruction (not in code)
 * Native Method Stack     native void nativeMethod(); (would be used if called)
 */
class MemoryDemo{

	// Static variable: stored in Method Area (Metaspace(in native memory, outside heap) in Java 8+)
	static int staticVar = 42;

	// Instance variable: stored in Heap
	int instanceVar = 7;

	// Native method declaration (for Native Method Stack demonstration)
	// In real usage, this would need a native library and JNI setup
	native void nativeMethod();

	void display(int param)
	{
		// Local variable: stored in Stack
		int localVar = 21;

		// Program Counter Register: JVM tracks which instruction is being executed (not directly accessible in Java)

		System.out.println("Static variable (Method Area): " + staticVar);
		System.out.println("Instance variable (Heap): " + instanceVar);
		System.out.println("Method parameter (Stack): " + param);
		System.out.println("Local variable (Stack): " + localVar);

		// Uncomment below to demonstrate Native Method Stack (requires native code setup)
		// nativeMethod();
	}
}

public class JavaMemoryAreas
{
	public static void main(String[] args)
	{
		// 'args' is a local variable (Stack)
		// Creating an object allocates memory in Heap
		MemoryDemo obj = new MemoryDemo();

		// Calling a method creates a new stack frame in Stack
		obj.display(99);

		// The JVM's Program Counter Register keeps track of the current instruction
	}
}

