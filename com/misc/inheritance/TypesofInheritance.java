package com.misc.inheritance;// Demonstrates: Single, Multilevel, Hierarchical, Multiple (interfaces), and Hybrid inheritance

/**
 * InheritanceDemo.java
 * This class demonstrates various types of inheritance in Java:
 * 1. Single inheritance
 * 2. Hierarchical inheritance
 * 3. Multilevel inheritance
 * 4. Multiple inheritance (via interfaces)
 * 5. Hybrid inheritance (class + multiple interfaces)
 */
// ========== 1.Single + Base ==========
class Vehicle
{
	void info()
	{
		System.out.println("Vehicle: generic vehicle");
	}
}

// Single inheritance: Car extends Vehicle
class Car extends Vehicle
{
	@Override
	void info()
	{
		System.out.println("Car: a vehicle with 4 wheels");
	}
}

// ========== 2.Hierarchical ==========
class Bus extends Vehicle
{
	@Override
	void info()
	{
		System.out.println("Bus: a vehicle for many passengers");
	}
}

// Another branch in the hierarchy
class Bike extends Vehicle
{
	@Override
	void info()
	{
		System.out.println("Bike: a two-wheeler vehicle");
	}
}

// ========== 3.Multilevel ==========
// FourWheeler extends Vehicle; CarPro extends FourWheeler (multilevel)
class FourWheeler extends Vehicle
{
	@Override
	void info()
	{
		System.out.println("FourWheeler: has four wheels");
	}
}

class CarPro extends FourWheeler
{
	@Override
	void info()
	{
		System.out.println("CarPro: a more specific four-wheeler (multilevel)");
	}
}

// ========== 4.Multiple Inheritance via Interfaces ==========
interface LandVehicle
{
	default void landInfo()
	{
		System.out.println("LandVehicle: can travel on land");
	}
}

interface WaterVehicle
{
	default void waterInfo()
	{
		System.out.println("WaterVehicle: can travel on water");
	}
}

// ========== 5.Hybrid (class inheritance + multiple interfaces) ==========
class AmphibiousVehicle extends Vehicle implements LandVehicle, WaterVehicle
{
	@Override
	void info()
	{
		System.out.println("AmphibiousVehicle: travels on land and water (hybrid: class + interfaces)");
	}
}

// ========== Driver ==========
public class TypesofInheritance
{
	public static void main(String[] args)
	{
		// Single
		Vehicle v1 = new Car();
		v1.info();

		// Hierarchical (different subclasses of the same parent)
		Vehicle v2 = new Bus();
		v2.info();
		Vehicle v3 = new Bike();
		v3.info();

		// Multilevel
		Vehicle v4 = new CarPro();
		v4.info();

		// Multiple (via interfaces) + Hybrid
		AmphibiousVehicle av = new AmphibiousVehicle();
		av.info();
		av.landInfo();
		av.waterInfo();

		// Bonus: show polymorphism across hierarchy
		Vehicle[] garage = {new Vehicle(), new FourWheeler(), new Car(), new CarPro(), new Bus(), new Bike(), av};
		System.out.println("--- Polymorphism demo ---");
		for (Vehicle v : garage)
		{
			v.info();
		}
	}
}