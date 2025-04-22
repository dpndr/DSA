package com.dpndr._basics;

import java.util.Scanner;

/**
 * Class to find the nth term in a Fibonacci sequence
 */
public class Q_Fibonacci {
    public static void main(String[] args) {

        // Initialize the first two numbers of Fibonacci sequences
        int a = 0;  // First number 
        int b = 1;  // Second number

        // Get user input for which term to find
        System.out.print("Enter the term that you want to know of fibonacci series: ");
        Scanner n = new Scanner(System.in);

        int j = n.nextInt();  // Store user input

        // Calculate Fibonacci number if term > 2
        if (j > 2) {
            for (int i = 2; i < j; i++) {
                int c = a + b;    // Next number is sum of previous two
                a = b;            // Update second-to-last number
                b = c;            // Update last number
            }
        }

        System.out.println(a + b);  // Print the nth Fibonacci number
    }
}
