package com.prepare.interview.patterns;// Solution.java

import java.util.Scanner;

/**
 * Write a Java program to print a right angle triangle pattern of stars.
 * The right angle is at the bottom left corner.
 */
public class RightAngleTrianglePattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // print right angle triangle of size n

        //row
        for (int i = 0; i < num; i++)
        {
            //columns
            for (int j = 0; j < num; j++)
            {
                if (i >= j)
                {
                    System.out.print("* ");
                }
                //use print only
            }
            //next line after printing all column
            System.out.println();
        }
    }
}
