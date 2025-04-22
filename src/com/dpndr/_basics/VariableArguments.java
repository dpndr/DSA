package com.dpndr._basics;

import java.util.Arrays;

// Class to demonstrate variable arguments
public class VariableArguments {

    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 60); // Pass multiple int arguments to fun() method
    }

    // Method that accepts a variable number of int arguments
    static void fun(int... v) { // v is treated as an array of integers
        System.out.println(Arrays.toString(v)); // Convert an array to string and print
    }
}