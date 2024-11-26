 package com.ciscointerview1.com;

public class AramStrongNumber {
    public static void main(String[] args) {
        int a = 23; // Input number
        int b = a;  // Store original number
        int count = 0;
        int rev = 0;

        // First loop: Find the number of digits in 'a'
        while (a > 0) {
            a = a / 10;
            count++;
        }

        // Reset 'a' back to the original value
        a = b;

        // Second loop: Calculate the Armstrong sum
        while (a > 0) {
            int rem = a % 10;
            rev = rev + (int) Math.pow(rem, count);
            a = a / 10;
        }

        // Check if the sum (rev) is equal to the original number
        if (rev == b) {
            System.out.println(b + " is an Armstrong number.");
        } else {
            System.out.println(b + " is not an Armstrong number.");
        }
    }
}
