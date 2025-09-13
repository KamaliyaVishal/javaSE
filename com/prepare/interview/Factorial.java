package com.prepare.interview;

import java.util.Scanner;

/**
 * Write a Java program to find the factorial of a number using recursion.
 * The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
 * Factorial of 0 is defined as 1.
 */
class Factorial
{
    public static long factorial(long n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        System.out.println(n);
        // Recursive case
        return n * factorial(n - 1);
    }
    
    public static void main(String agrs[]){
        
        //User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        long number = scanner.nextLong();
        
        //call factorial()
        System.out.printf("factorial of %d is %d%n", number, factorial(number));
    }
}


