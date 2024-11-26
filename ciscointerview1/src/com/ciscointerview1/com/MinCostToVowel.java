package com.ciscointerview1.com;
import java.util.Scanner;

public class MinCostToVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        scanner.close();
        int minCost = findMinCostToVowel(str);
        System.out.println(minCost);
    }
    private static int findMinCostToVowel(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int minCost = Integer.MAX_VALUE; 
        for (char targetVowel : vowels) {
            int totalCost = 0;

            for (char c : str.toCharArray()) {
                if (c != targetVowel) {
                    totalCost += 10;                 }
            }
            minCost = Math.min(minCost, totalCost);
        }

        return minCost;
    }
}
