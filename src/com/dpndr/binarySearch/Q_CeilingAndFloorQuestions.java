package com.dpndr.binarySearch;

/**
 * Practice Questions for Binary Search Ceiling and Floor:
 * <p>
 * Q1. Ceiling of a number
 * Given a sorted array and a target value, find the smallest element in the array
 * that is greater than or equal to the target.
 * Example: arr = [2,3,5,9,14,16,18], target = 14
 * Output: 14 (index 4)
 * Example: arr = [2,3,5,9,14,16,18], target = 15
 * Output: 16 (index 5)
 * <p>
 * Q2. Floor of a number
 * Given a sorted array and a target value, find the largest element in the array
 * that is less than or equal to the target.
 * Example: arr = [2,3,5,9,14,16,18], target = 14
 * Output: 14 (index 4)
 * Example: arr = [2,3,5,9,14,16,18], target = 15
 * Output: 14 (index 4)
 * <p>
 * Q3. The smallest Letter
 * Given a character array letters that is sorted in ascending order and a character
 * target, returns the smallest character in the array that is larger than the target.
 * Return the first character if the letter is not in the list
 * Note that the letters wrap around.
 * Example: letters = ["c","f","j"], target = "a"
 * Output: "c"
 * Example: letters = ["c","f","j"], target = "c"
 * Output: "f"
 */

public class Q_CeilingAndFloorQuestions {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};           // Test array for ceiling and floor
        char[] letters = {'c', 'f', 'j', 'm', 'p', 'r'}; // Test array for the smallest letter

        System.out.println(ceiling(arr, 10));            // Test ceiling function
        System.out.println(floor(arr, 10));             // Test floor function  
        System.out.println(smallest_letter_greater_than_tar(letters, 'h')); // Test the smallest letter function
    }

    /**
     * Finds smallest element >= target in sorted array
     *
     * @param arr Sorted array to search in
     * @param tar Target value to find ceiling for
     * @return Index of a ceiling element, -1 if an array is empty
     */
    static int ceiling(int[] arr, int tar) {
        if (arr.length < 1) {
            return -1;  // Return -1 for an empty array
        }

        int st = 0;                // Start index
        int end = arr.length - 1;  // End index
        while (st <= end) {        // Binary search loop
            int mid = st + (end - st) / 2;  // Calculate middle index
            if (arr[mid] == tar) {
                return mid;         // Found exact match
            }
            if (tar < arr[mid]) {
                end = mid - 1;     // Target in the left half
            } else {
                st = mid + 1;      // Target in the right half
            }
        }
        return st;  // Return the first element greater than the target
    }

    /**
     * Finds largest element <= target in sorted array
     *
     * @param arr Sorted array to search in
     * @param tar Target value to find a floor for
     * @return Index of a floor element, -1 if an array is empty
     */
    static int floor(int[] arr, int tar) {
        if (arr.length < 1) {
            return -1;  // Return -1 for an empty array
        }

        int st = 0;                // Start index
        int end = arr.length - 1;  // End index
        while (st <= end) {        // Binary search loop
            int mid = st + (end - st) / 2;  // Calculate middle index
            if (arr[mid] == tar) {
                return mid;         // Found exact match
            }
            if (tar < arr[mid]) {
                end = mid - 1;     // Target in the left half
            } else {
                st = mid + 1;      // Target in the right half
            }
        }
        return end;  // Return last element smaller than target
    }

    /**
     * Finds the smallest character > target in a sorted array
     *
     * @param arr Sorted character array
     * @param tar Target character
     * @return Smallest character greater than target
     */
    static char smallest_letter_greater_than_tar(char[] arr, char tar) {
        int st = 0;                // Start index
        int end = arr.length - 1;  // End index
        while (st <= end) {        // Binary search loop
            int mid = st + (end - st) / 2;  // Calculate middle index
            if (tar < arr[mid]) {
                end = mid - 1;     // Target in the left half
            } else {
                st = mid + 1;      // Target in the right half
            }
        }
        return arr[st % arr.length];  // Return first char greater than target
    }
}