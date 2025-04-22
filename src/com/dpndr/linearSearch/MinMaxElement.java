package com.dpndr.linearSearch;

public class MinMaxElement {
    public static void main(String[] args) {
        int[] arr = {53, 23, 4, 56, -1, 7, 8, -6, 2, 54, 3, 6};  // Sample array with integers including negative numbers
        System.out.println(min_element(arr));  // Print minimum element in array 
        System.out.println(max_element(arr));  // Print maximum element in array
    }

    /**
     * Finds minimum element in array
     *
     * @param arr Array to find a minimum element in
     * @return Minimum element in array
     */
    static int min_element(int[] arr) {
        int min = Integer.MAX_VALUE;  // Initialize min as maximum possible integer value

        for (int i = 0; i < arr.length; i++) {  // Loop through an array
            if (arr[i] < min) {  // Update min if the current element is smaller
                min = arr[i];
            }
        }

        return min;  // Return a minimum element found
    }

    /**
     * Finds maximum element in array
     *
     * @param arr Array to find maximum element in
     * @return Maximum element in array
     */
    static int max_element(int[] arr) {
        int max = Integer.MIN_VALUE; // Initialize max as minimum possible integer value

        for (int i = 0; i < arr.length; i++) { // Loop through an array
            if (arr[i] > max) { // Update max if current element is larger
                max = arr[i];
            }
        }

        return max; // Return a maximum element found
    }
}