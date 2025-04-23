/**
 * Binary Search:
 * - Efficient searching algorithm for sorted arrays
 * - Divides search space in half at each step
 * - Requires a sorted array
 * - Time complexity: O(log n)
 * - Space complexity: O(1) iterative, O(log n) recursive
 * <p>
 * How it works:
 * 1. Start with sorted array
 * 2. Find a middle element of array
 * 3. If the target equals a middle element, return its index
 * 4. If the target is greater than a middle, search right half
 * 5. If the target is less than a middle, search left half
 * 6. Repeat steps 2-5 until an element is found or search space exhausted
 */
package com.dpndr.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 15, 23, 45, 67, 89, 92, 99};  // Sample a sorted array
        System.out.println(binary_search(arr, 67));     // Print the result of a function
    }

    /**
     * Performs binary search to find an element in a sorted array
     *
     * @param arr    Sorted array to search in
     * @param target Target element to find
     * @return Index of a target element if found, -1 if not found or array empty
     */
    static int binary_search(int[] arr, int target) {
        if (arr.length < 1) {
            return -1;  // Return -1 if an array is empty
        }

        int start = 0;              // Start index of search range
        int end = arr.length - 1;   // End index of search range

        while (start <= end) {      // Continue while a valid search range exists
            int mid = start + (end - start) / 2;  // Calculate the middle index (prevents overflow)

            if (arr[mid] == target) {
                return mid;         // Found target, return its index
            }

            if (arr[mid] < target) {
                start = mid + 1;    // Target is in the right half, update start
            } else {
                end = mid - 1;      // Target is in the left half, update end
            }
        }
        return -1;  // Target not found in an array
    }
}
