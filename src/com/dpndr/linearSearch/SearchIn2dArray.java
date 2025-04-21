package com.dpndr.linearSearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1, 45, 67},
                {89, 54, 2,},
                {27, 8, 16, 98, 42},
                {4, 6, 8, 34}};
        System.out.println(Arrays.toString(search(arr, 45)));
    }

    static int[] search(int[][] arr, int tar) {

        if (arr.length < 1) {
            return (new int[]{-1, -1});
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == tar) {
                    return (new int[]{i, j});
                }
            }
        }

        return (new int[]{-1, -1});
    }

}
