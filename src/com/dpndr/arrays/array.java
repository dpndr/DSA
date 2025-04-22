package com.dpndr.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner object for input
        int[] arr = new int[6]; // Create an array with size 6

        // Reading input values into an array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // Print array contents

        // Create 3x3 2D array
        int[][] arr2 = new int[3][3]; // Defining a row is mandatory we can or cannot define a column

        // Reading input values into a 2D array
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        // Print each row of a 2D array
        for (int[] ints : arr2) {
            System.out.println(Arrays.toString(ints));
        }
    }
}