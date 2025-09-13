package com.misc.collections;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Demonstrates the use of Comparator interface for custom ordering.
 */
class Movie
{
	String name;
	double rating;
	int year;

	Movie(String name, double rating, int year)
	{
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public String toString()
	{
		return name + " " + rating + " " + year;
	}
}

// Comparator to sort by name, then by rating (descending)
class NameThenRatingComparator implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		int nameCompare = m1.name.compareTo(m2.name);
		if (nameCompare != 0)
		{
			return nameCompare; // Sort by name
		}
		else
		{
			return Double.compare(m2.rating, m1.rating); // If names are same, sort by rating descending
		}
	}
}

public class ComparatorDemo
{
	public static void main(String[] args)
	{
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Star Wars", 8.7, 1977));
		movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
		movies.add(new Movie("Return of the Jedi", 8.4, 1983));
		movies.add(new Movie("Star Wars", 8.5, 1997));
		movies.add(new Movie("Empire Strikes Back", 8.9, 1980));

		Collections.sort(movies, new NameThenRatingComparator());

		System.out.println("Movies sorted by name, then by rating:");
		for (Movie m : movies)
		{
			System.out.println(m);
		}

	}
}