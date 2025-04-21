package com.dpndr._basics;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        greeting();
        Scanner in = new Scanner(System.in);

        System.out.println(sum(5, 2));
        System.out.println(greet());
    }
    static void greeting(){
        System.out.println("Hello, World!");
    }
    static int sum(int a, int b){
        return (a+b);
    }
    static String greet(){
        return "Hello!";
    }
}
