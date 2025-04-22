package com.dpndr.linearSearch;

public class StringLinearSearch {
    public static void main(String[] args) {

        String name = "Deependra Dhakad";  // Sample string to search in
        System.out.println(string_linear_search(name, ' ')); // Search for space character

    }

    /**
     * Performs linear search in string to find a character
     *
     * @param str String to search in
     * @param tar Target character to find
     * @return Index of target character if found, -1 if not found or string empty
     */
    static int string_linear_search(String str, char tar) {
        if (str.isEmpty()) {
            return -1;  // Return -1 if the string is empty
        }

        for (int i = 0; i < str.length(); i++) {  // Loop through each character
            if (str.charAt(i) == tar) {  // If target character found
                return i;  // Return its index
            }
        }

        return -1;  // Character not found
    }

}