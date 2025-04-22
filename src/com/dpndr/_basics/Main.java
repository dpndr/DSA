package com.dpndr._basics;

import java.util.Scanner;

// Main class that demonstrates basic scanner input
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter any string: ");  // Prompt user for input
        Scanner sc = new Scanner(System.in);     // Create a scanner object
        System.out.println(sc.nextLine());       // Read and print user input
    }

}