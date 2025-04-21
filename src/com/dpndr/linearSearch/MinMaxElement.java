package com.dpndr.linearSearch;

public class MinMaxElement {
    public static void main(String[] args) {
        int[] arr = {53, 23, 4, 56, -1, 7, 8, -6, 2, 54, 3, 6};
        System.out.println(min_element(arr));
        System.out.println(max_element(arr));
    }

    static int min_element(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static int max_element(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
