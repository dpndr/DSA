package com.dpndr.binarySearch;
/**
 * Problem: Find Rotation Count in Rotated Sorted Array
 * Given a rotated sorted array, find the number of times the array has been rotated.
 * Example: [4,5,6,7,0,1,2] is rotated 4 times from [0,1,2,4,5,6,7]
 * The rotation count is equal to the index of the minimum element.
 */

public class Q_RotationCount {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 11, 2, 3, 4, 5, 6};  // Sample rotated sorted array
        int[] arrWithDuplicates = {2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 2, 2};  // Sample rotated array with duplicates

        System.out.println(rotation_count(arr));         // Print rotation count
        System.out.println(rotation_count_duplicates(arrWithDuplicates)); // Print rotation count for array with duplicates
    }

    /**
     * Finds the number of times a sorted array has been rotated by finding index of the minimum element
     *
     * @param arr Rotated sorted array
     * @return Number of rotations (index of minimum element)
     */
    static int rotation_count(int[] arr) {
        int st = 0;                     // Start index
        int end = arr.length - 1;       // End index

        while (st < end) {
            int mid = st + (end - st) / 2; // Find the middle element

            if (arr[mid] > arr[st]) {      // If middle greater than start
                st = mid;                 // Minimum lies in the right half
            } else {
                end = mid;                // Minimum lies in the left half including mid
            }
        }
        return st + 1;                    // Index position + 1 gives a rotation count
    }

    static int rotation_count_duplicates(int[] arr) {
        int st = 0;                     // Start index
        int end = arr.length - 1;       // End index

        while (st < end) {
            int mid = st + (end - st) / 2; // Find the middle element

            if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                // Skip duplicate elements
                if(arr[st]>arr[st+1]){
                    st++;
                }
                end--;
                continue;
            }

            if (arr[mid] >= arr[st]) {      // If middle greater than or equal to start
                if (arr[mid] > arr[end]) {   // The right half is not sorted
                    st = mid + 1;           // Minimum lies in the right half
                } else {
                    end = mid;              // The left half including mid may contain a minimum
                }
            } else {                        // If middle less than start
                end = mid;                  // Minimum lies in the left half including mid
            }
        }
        return st;                         // Index position gives a rotation count
    }
}