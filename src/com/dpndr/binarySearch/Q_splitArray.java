package com.dpndr.binarySearch;

/*
Given an integer array nums and an integer k, 
split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

Example :
Input: nums = [7,2,5,10,8], k = 2  
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
*/
public class Q_splitArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};  // Test array
        System.out.println(splitArray(arr, 2));  // Print result for k=2
    }

    /**
     * Splits array into k subarrays such that the largest subarray sum is minimized
     *
     * @param nums Array to split
     * @param k    Number of subarrays to split into
     * @return Minimized largest sum possible
     */
    static int splitArray(int[] nums, int k) {
        int st = 0;     // Start with max element as minimum possible sum
        int end = 0;    // End with total sum as maximum possible sum
        for (int num : nums) {
            st = Math.max(st, num);  // Find largest element
            end += num;              // Calculate total sum
        }

        // Binary search on possible sums
        while (st < end) {
            int mid = st + (end - st) / 2;  // Calculate middle sum
            int sum = 0;   // Current subarray sum
            int arr = 1;   // Count of subarrays needed

            // Try to split the array with mid as maximum allowed sum
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;     // Start new subarray
                    arr++;         // Increment subarray count
                } else {
                    sum += num;    // Add to current subarray
                }
            }

            if (arr > k) {
                st = mid + 1;   // Need more subarrays, increase minimum sum
            } else {
                end = mid;      // Can try with a smaller sum
            }
        }
        return st;  // Return minimum largest subarray sum
    }
}