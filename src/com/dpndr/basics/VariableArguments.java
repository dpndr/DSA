package com.dpndr.basics;

import java.util.Arrays;

public class VariableArguments {

    public static void main(String[] args) {
        fun(1,2,3,4,5,6, 60);
    }

     static void fun(int ...v) {

        System.out.println(Arrays.toString(v));
    }
}
