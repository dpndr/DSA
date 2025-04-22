package com.dpndr._basics;

import java.util.Scanner;

// Class containing different function examples
public class Functions {
    public static void main(String[] args) {
        greeting();  // Call greeting function
        Scanner in = new Scanner(System.in);  // Create a scanner object for input

        System.out.println(sum(5, 2));  // Print sum of 5 and 2
        System.out.println(greet());  // Print greeting message
    }

    // Function to print a hello world
    static void greeting() {
        System.out.println("Hello, World!");
    }

    // Function to add two integers
    static int sum(int a, int b) {
        return (a + b);  // Return a sum of parameters
    }

    // Function to return a hello message
    static String greet() {
        return "Hello!";  // Return greeting string
    }
}