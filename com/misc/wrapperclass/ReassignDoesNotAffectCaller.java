package com.misc.wrapperclass;

class Box
{
	int value;

	Box(int value)
	{
		this.value = value;
	}
}

public class ReassignDoesNotAffectCaller
{
	static void reassign(Box b)
	{
		b = new Box(123); // rebinds only the local parameter
		b.value = 777;    // affects the new object, not the caller’s
	}

	public static void main(String[] args)
	{
		Box box = new Box(10);
		reassign(box);
		System.out.println(box.value); // 10 — original reference unchanged
	}
}