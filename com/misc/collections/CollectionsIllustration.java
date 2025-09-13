package com.misc.collections;

import java.util.*;

public class CollectionsIllustration
{
	public static void main(String[] args)
	{
		// List Examples
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		Vector<Integer> vector = new Vector<>();
		Stack<String> stack = new Stack<>();

		// Adding elements
		for (int i = 1; i <= 5; i++)
		{
			arrayList.add(i);
			linkedList.add(i);
			vector.add(i);
		}
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");

		System.out.println("ArrayList: " + arrayList);
		System.out.println("LinkedList: " + linkedList);
		System.out.println("Vector: " + vector);
		System.out.println("Stack: " + stack);

		// Remove element at index 3
		arrayList.remove(3);
		linkedList.remove(3);
		vector.remove(3);
		stack.pop();

		System.out.println("ArrayList after removal: " + arrayList);
		System.out.println("LinkedList after removal: " + linkedList);
		System.out.println("Vector after removal: " + vector);
		System.out.println("Stack after pop: " + stack);

		// Queue Examples
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(10);
		priorityQueue.add(20);
		priorityQueue.add(15);
		System.out.println("PriorityQueue: " + priorityQueue);
		System.out.println("PriorityQueue peek: " + priorityQueue.peek());
		System.out.println("PriorityQueue poll: " + priorityQueue.poll());
		System.out.println("PriorityQueue after poll: " + priorityQueue);

		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		arrayDeque.add(10);
		arrayDeque.add(20);
		arrayDeque.addFirst(5);
		arrayDeque.addLast(25);
		System.out.println("ArrayDeque: " + arrayDeque);
		arrayDeque.clear();
		arrayDeque.addFirst(564);
		arrayDeque.addFirst(291);
		arrayDeque.addLast(24);
		arrayDeque.addLast(14);
		System.out.println("ArrayDeque after clear and add: " + arrayDeque);

		// Set Examples
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Geeks");
		hashSet.add("For");
		hashSet.add("Geeks"); // duplicate ignored
		hashSet.add("Is");
		hashSet.add("Very helpful");
		System.out.println("HashSet: " + hashSet);

		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Geeks");
		linkedHashSet.add("For");
		linkedHashSet.add("Geeks");
		linkedHashSet.add("Is");
		linkedHashSet.add("Very helpful");
		System.out.println("LinkedHashSet: " + linkedHashSet);

		SortedSet<String> treeSet = new TreeSet<>();
		treeSet.add("Geeks");
		treeSet.add("For");
		treeSet.add("Geeks");
		treeSet.add("Is");
		treeSet.add("Very helpful");
		System.out.println("TreeSet: " + treeSet);

		// Map Examples
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Geeks");
		hashMap.put(2, "For");
		hashMap.put(3, "Geeks");
		System.out.println("HashMap: " + hashMap);
		System.out.println("Value for key 1: " + hashMap.get(1));

		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Geeks");
		treeMap.put(2, "For");
		treeMap.put(3, "Geeks");
		System.out.println("TreeMap: " + treeMap);

		// Demonstrate some Collection methods
		System.out.println("ArrayList contains 2? " + arrayList.contains(2));
		System.out.println("LinkedList size: " + linkedList.size());
		System.out.println("Is Vector empty? " + vector.isEmpty());

		// Iterating over a Set using Iterator
		System.out.print("Iterating HashSet: ");
		Iterator<String> itr = hashSet.iterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		// Convert List to Array
		Object[] arr = arrayList.toArray();
		System.out.print("ArrayList as Array: ");
		for (Object o : arr)
		{
			System.out.print(o + " ");
		}
		System.out.println();

	}
}