package com.dpndr.linearSearch;

public class SearchInRange {

    public static void main(String[] args) {

        int[] arr = {1, 23, 4, 56, 7, 8, 69, 2, 54, 3, 6};  // Sample an array to search in
        System.out.println(search_in_range(arr, 56, 2, 8));   // Search for element 6 between index 2 and 8

    }

    /**
     * Performs linear search in a given range of array indices
     *
     * @param arr Array to search in
     * @param tar Target element to find
     * @param st  Starting index of range
     * @param end Ending index of range
     * @return Index of a target element if found, -1 if not found or array empty
     */
    static int search_in_range(int[] arr, int tar, int st, int end) {
        if (arr.length >= 1) {
            for (int i = st; i <= end; i++) {  // Loop through range
                if (arr[i] == tar) {  // If target found
                    return i;          // Return its index
                }
            }
        } else {
            return -1;  // Return -1 if an array empty
        }
        return -1;     // Return -1 if target not found
    }
}