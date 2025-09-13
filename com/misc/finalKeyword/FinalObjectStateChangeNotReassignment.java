package com.misc.finalKeyword;
/**
 * * This Java program demonstrates that a final reference variable can change the internal state of the object it refers to,
 * but it cannot be reassigned to point to a different object.
 *
 * In this example, we use a StringBuilder object as a final reference variable.
 * We can modify the content of the StringBuilder, but we cannot reassign the final reference variable to a new StringBuilder object.
 */
class FinalObjectStateChangeNotReassignment
{

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of StringBuilder class Final reference variable
        final StringBuilder sb = new StringBuilder("Geeks");

        // Printing the element in StringBuilder object
        System.out.println(sb);

        // changing internal state of object reference by final reference variable sb
        sb.append("ForGeeks");

        // Again printing the element in StringBuilder object after appending above element in it
        System.out.println(sb);

        // Uncommenting the above line will result in a compilation error:
        //sb = new StringBuilder("Reassignment"); // This line will cause a compilation error because sb is final and cannot be reassigned.
        // "cannot assign a value to final variable sb"
        // However, the internal state of the object that sb refers to can still be changed.
        // For example, you can still call methods on sb to modify its content, but you
    }
}