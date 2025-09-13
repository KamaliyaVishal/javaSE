package com.miiniprojects.invetorymanagementsystem;

import java.util.*;

public class Inventory<T>
{
	private List<T> items;

	public Inventory()
	{
		items = new ArrayList<>();
	}

	// Add an item to the inventory
	public void addItem(T item)
	{
		try
		{
			items.add(item);
			System.out.println("Item added successfully: " + item);
		}
		catch (Exception e)
		{
			System.out.println("Error adding item: " + e.getMessage());
		}
	}

	// Remove an item from the inventory
	public void removeItem(T item)
	{
		try
		{
			if (!items.contains(item))
			{
				throw new IllegalArgumentException("Item not found in inventory.");
			}
			items.remove(item);
			System.out.println("Item removed successfully: " + item);
		}
		catch (Exception e)
		{
			System.out.println("Error removing item: " + e.getMessage());
		}
	}

	// View all items in the inventory
	public void viewItems()
	{
		if (items.isEmpty())
		{
			System.out.println("Inventory is empty.");
		}
		else
		{
			System.out.println("Inventory items:");
			for (T item : items)
			{
				System.out.println(item);
			}
		}
	}

	// Getter method for items
	public List<T> getItems()
	{
		return items;
	}
}