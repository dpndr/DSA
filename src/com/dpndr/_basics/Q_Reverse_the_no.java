package com.dpndr._basics;

public class Q_Reverse_the_no {
    /**
     * Program to reverse an integer number
     */
    public static void main(String[] args) {
        int n = 86737457;     // Number to reverse
        int ans = 0;          // Variable to store reversed number
        while (n > 1) {        // Loop until all digits are processed
            int rem = n % 10;   // Get last digit
            ans = ans * 10 + rem; // Add a digit to answer and shift left
            n = n / 10;          // Remove last digit from original number
        }
        System.out.println(ans); // Print reversed number
    }
}