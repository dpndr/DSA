package com.dpndr.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>(3);
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr.contains(4));
        System.out.println(arr);

        arr.set(2, 50); // sets 2nd index to 50
        System.out.println(arr);

        arr.remove(5); // element at index 5 will be removed
        System.out.println(arr);

        System.out.println(arr.get(2)); // get an element at index 4

       //  Multi dimension ArrayList

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                list.get(j).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
