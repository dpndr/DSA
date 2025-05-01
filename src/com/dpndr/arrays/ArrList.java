package com.dpndr.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Scanner for input

        // Create ArrayList with initial capacity 3
        ArrayList<Integer> arr = new ArrayList<>(3);

        // Add numbers 0-9 to ArrayList
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr.contains(4)); // Check if 4 exists in ArrayList
        System.out.println(arr); // Print ArrayList contents

        arr.set(2, 50); // Set element at index 2 to 50
        System.out.println(arr);

        arr.remove(5); // Remove element at index 5
        System.out.println(arr);

        System.out.println(arr.get(2)); // Get an element at index 2

        // Create 2D ArrayList 
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize each row as a new ArrayList
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Take user input to populate 2D ArrayList
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                list.get(j).add(in.nextInt());
            }
        }
        System.out.println(list); // Print 2D ArrayList
    }
}