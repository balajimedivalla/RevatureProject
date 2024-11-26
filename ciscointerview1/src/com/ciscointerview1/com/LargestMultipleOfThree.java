package com.ciscointerview1.com;

import java.util.Arrays;
import java.util.Scanner;

public class LargestMultipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        Arrays.sort(digits);
        int sum = 0;
        int[] resultList = new int[n];
        int idx = 0;
        for (int i = n - 1; i >= 0; i--) {
            resultList[idx++] = digits[i];
            sum += digits[i];
        }
        if (sum % 3 == 1) {
            boolean removed = false;
            for (int i = n - 1; i >= 0; i--) {
                if (resultList[i] % 3 == 1) {
                    resultList[i] = -1; // Mark for removal
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                int removedCount = 0;
                for (int i = n - 1; i >= 0; i--) {
                    if (resultList[i] % 3 == 2) {
                        resultList[i] = -1; // Mark for removal
                        removedCount++;
                        if (removedCount == 2) break;
                    }
                }
            }
        } else if (sum % 3 == 2) {
            boolean removed = false;
            for (int i = n - 1; i >= 0; i--) {
                if (resultList[i] % 3 == 2) {
                    resultList[i] = -1; // Mark for removal
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                int removedCount = 0;
                for (int i = n - 1; i >= 0; i--) {
                    if (resultList[i] % 3 == 1) {
                        resultList[i] = -1; // Mark for removal
                        removedCount++;
                        if (removedCount == 2) break;
                    }
                }
            }
        }
        boolean allZeros = true;
        for (int i = 0; i < n; i++) {
            if (resultList[i] != 0 && resultList[i] != -1) {
                allZeros = false;
                break;
            }
        }
        if (allZeros) {
            System.out.println("0");
            return;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (resultList[i] != -1) {
                result.append(resultList[i]);
            }
        }
        System.out.println(result.toString());

        sc.close();
    }
}
