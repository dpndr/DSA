package com.dpndr._basics;

public class Q_ArmstrongNo {
    /**
     * Main method to check Armstrong numbers from 0 to 999
     */
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {  // Check numbers 0 through 999
            if (isArmstrong(i)) {         // If the number is Armstrong number
                System.out.println(i);     // Print the Armstrong number
            }
        }
    }

    /**
     * Checks if a number is an Armstrong number
     * An Armstrong number is one where a sum of cubes of digits equals the number itself
     *
     * @param a Number to check
     * @return true if the number is Armstrong number, false otherwise
     */
    static boolean isArmstrong(int a) {
        int b = a;                    // Store original number
        int sum = 0;                  // Initialize a sum of cubes
        while (a > 0) {              // Process each digit
            int rem = a % 10;         // Get rightmost digit
            a = a / 10;              // Remove rightmost digit
            sum += rem * rem * rem;   // Add a cube of a digit to sum
        }
        return (sum == b);           // Check if a sum equals the original number
    }
}