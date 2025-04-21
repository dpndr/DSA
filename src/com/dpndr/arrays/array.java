package com.dpndr.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[][] arr2 = new int[3][3]; // Defining a row is mandatory we can or cannot define a column

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = in.nextInt();
            }
        }
        for (int[] ints : arr2) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
