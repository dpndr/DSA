package com.dpndr.binarySearch;

/**
 * Order-agnostic binary search implementation that works with both ascending and descending sorted arrays
 */
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] ascArr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};  // Ascending order array for testing
        int[] descArr = {20, 18, 16, 14, 12, 10, 8, 6, 4, 2}; // Descending order array for testing

        // Test binary search on both array types
        System.out.println("Searching in ascending array for 12: " + order_agnosticBS(ascArr, 12));
        System.out.println("Searching in descending array for 14: " + order_agnosticBS(descArr, 14));
    }

    /**
     * Performs binary search on a sorted array without knowing if it's ascending or descending
     *
     * @param arr Input a sorted array
     * @param tar Target value to find
     * @return Index of target if found, -1 otherwise
     */
    static int order_agnosticBS(int[] arr, int tar) {
        if (arr.length < 1) {
            return -1;  // Handle an empty array case
        }
        int st = 0;                    // Start index
        int end = arr.length - 1;      // End index

        boolean isAsc = (arr[0] < arr[(arr.length - 1)]);  // Checks if an array is sorted in ascending order

        if (isAsc) {
            // Binary search for an ascending order array
            while (st <= end) {
                int mid = st + (end - st) / 2;  // Calculate middle to avoid overflow
                if (arr[mid] == tar) {
                    return mid;         // Target found
                }
                if (tar > arr[mid]) {
                    st = mid + 1;      // Search right half
                } else {
                    end = mid - 1;     // Search left half
                }
            }
        } else {
            // Binary search for a descending order array
            while (st <= end) {
                int mid = st + (end - st) / 2;  // Calculate middle to avoid overflow
                if (arr[mid] == tar) {
                    return mid;         // Target found
                }
                if (tar < arr[mid]) {
                    st = mid + 1;      // Search right half
                } else {
                    end = mid - 1;     // Search left half
                }
            }
        }
        return -1;  // Target not found
    }
}

