package com.dpndr._basics;

public class Q_Reverse_the_no {
    public static void main(String[] args) {
        int n = 86737457;
        int ans = 0;
        while (n > 1){
            int rem = n %10;
            ans = ans*10 + rem;
            n = n/10;
        }
        System.out.println(ans);
    }
}
