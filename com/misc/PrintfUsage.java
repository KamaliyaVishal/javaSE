package com.misc;

public class PrintfUsage
{
    public static void main(String[] args)
    {
        String name = "Alice";
        int age = 30;
        double salary = 12345.6789;

        System.out.printf("Name: %s, Age: %s%n", name, age);
        // Output: Name: Alice, Age: 30

        System.out.printf("Salary: %.2f%n", salary);
        // Output: Salary: 12345.68

        System.out.printf("Salary (formatted): %25.4f%n", salary);
        // Output:      Salary (formatted):         12345.6789

        // Using print()
        System.err.print("This is an error message using print().\n");

        // Using println()
        System.err.println("This is another error message using println().");

        //Using printf()
        System.err.printf("Error code: %d, Message: %s%n", 404, "Not Found");
    }
}