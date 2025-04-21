package com.dpndr.basics;

public class Shadowing {
///     It doesn't take place in method It's for class variables
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);
        int x; // The class variable is shadowed here
//        System.out.println(x); //This will give an error
        x = 40;
        System.out.println(x); // this will give the value initialized in the lower scope
    }
}
