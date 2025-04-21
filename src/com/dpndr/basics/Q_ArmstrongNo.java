package com.dpndr.basics;

public class Q_ArmstrongNo {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int a) {
        int b = a;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            sum += rem * rem * rem;
        }
        return (sum == b);
    }
}
