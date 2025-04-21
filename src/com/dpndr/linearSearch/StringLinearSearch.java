package com.dpndr.linearSearch;

public class StringLinearSearch {
    public static void main(String[] args) {

        String name = "Deependra Dhakad";
        System.out.println(string_linear_search(name, ' '));

    }

    static int string_linear_search(String str, char tar) {
        if (str.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == tar) {
                return i;
            }
        }

        return -1;
    }

}
