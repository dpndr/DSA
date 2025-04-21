package com.dpndr.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1, 23, 4, 56, 7, 8, 69, 2, 54, 3, 6};
        System.out.println(linear_search(arr, 3));

    }

    static int linear_search(int[] arr, int tar) {
        if (arr.length < 1) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }

        return -1;
    }

}

