package com.dpndr._basics;

/**
 * Class demonstrating variable shadowing concept in Java
 */
public class Shadowing {
    // Class level static variable
    static int x = 90;  // Initial value of x

    public static void main(String[] args) {
        System.out.println(x);  // Prints class level x (90)
        int x;  // Local variable shadows class level x
        // System.out.println(x);  // Error - local x not initialized yet
        x = 40;  // Initialize local x
        System.out.println(x);  // Prints local x (40)
    }
}