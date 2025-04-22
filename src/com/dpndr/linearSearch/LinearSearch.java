package com.dpndr.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1, 23, 4, 56, 7, 8, 69, 2, 54, 3, 6};   // Sample an array to search in

        System.out.println(linear_search(arr, 3));   // Print index position of element 3 in the array
    }

    /**
     * Performs linear search to find an element in an array
     *
     * @param arr Array to search in
     * @param tar Target element to find
     * @return Index of a target element if found, -1 if not found or array empty
     */
    static int linear_search(int[] arr, int tar) {
        if (arr.length < 1) {
            return -1;   // Return -1 if an array is empty
        }

        // Loop through each element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {      // If an element found, return its index
                return i;
            }
        }

        return -1; // Element not found
    }
}