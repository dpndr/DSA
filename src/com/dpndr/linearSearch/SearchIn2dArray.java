package com.dpndr.linearSearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        // Sample 2D array with different sized rows
        int[][] arr = {{23, 4, 1, 45, 67},
                {89, 54, 2,},
                {27, 8, 16, 98, 42},
                {4, 6, 8, 34}};
        System.out.println(Arrays.toString(search(arr, 45))); // Print indices of target element 45
    }

    /**
     * Searches for a target element in 2D array using linear search
     *
     * @param arr 2D array to search in
     * @param tar Target element to find
     * @return Array containing row and column indices if found, [-1,-1] if not found
     */
    static int[] search(int[][] arr, int tar) {

        if (arr.length < 1) {
            return (new int[]{-1, -1}); // Return [-1,-1] if an array is empty
        }

        // Loop through each row
        for (int i = 0; i < arr.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == tar) { // If target found
                    return (new int[]{i, j}); // Return row and column indices
                }
            }
        }

        return (new int[]{-1, -1}); // Target not found
    }

}