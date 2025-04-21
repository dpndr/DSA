package com.dpndr.linearSearch;

public class SearchInRange {

    public static void main(String[] args) {

        int[] arr = {1, 23, 4, 56, 7, 8, 69, 2, 54, 3, 6};
        System.out.println(search_in_range(arr, 6, 2, 8));

    }

    // Search in range
    static int search_in_range(int[] arr, int tar, int st, int end) {
        if (arr.length >= 1) {
            for (int i = st; i <= end; i++) {
                if (arr[i] == tar) {
                    return i;
                }
            }
        } else {
            return -1;
        }
        return -1;
    }
}
