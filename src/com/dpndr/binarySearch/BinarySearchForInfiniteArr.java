package com.dpndr.binarySearch;

/**
 * Binary search implementation for an infinite sorted array
 * Uses exponential growth of search bounds to find the target element
 */
public class BinarySearchForInfiniteArr {

    public static void main(String[] args) {
        // Test array with numbers 1-100
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        System.out.println(binary_search_infinite(arr, 39));  // Search for element 39
    }

    /**
     * Performs binary search on a theoretically infinite sorted array
     *
     * @param arr Input a sorted array
     * @param tar Target element to find
     * @return Index of target if found, -1 otherwise
     */
    static int binary_search_infinite(int[] arr, int tar) {
        int st = 0;      // Start index
        int end = 1;     // End index 
        int sz = end - st + 1;      // Size of a search window

        // Exponentially increase search bounds until the target is within range
        while (tar > arr[end]) {
            sz *= 2;                // Double the window size
            st = end + 1;           // Move start to the next element
            end = st + sz - 1;      // Set a new end based on window size
        }

        // Regular binary search within found bounds
        while (st <= end) {
            int mid = st + (end - st) / 2;  // Calculate middle index

            if (tar == arr[mid]) {
                return mid;         // Target found
            } else if (tar < arr[mid]) {
                end = mid - 1;      // Search left half
            } else {
                st = mid + 1;       // Search right half
            }
        }
        return -1;  // Target not found
    }
}