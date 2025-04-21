package com.dpndr._basics;

import java.util.Scanner;

public class Q_Fibonacci {
    public static void main(String[] args) {

//      Fibonacci

        int a = 0;
        int b = 1;

        System.out.print("Enter the term that you want to know of fibonacci series: ");
        Scanner n = new Scanner(System.in);

        int j = n.nextInt();
        if (j > 2) {
            for (int i = 2; i < j; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
        }
        System.out.println(a + b);
    }
}

