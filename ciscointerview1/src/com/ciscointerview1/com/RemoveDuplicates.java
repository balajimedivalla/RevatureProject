package com.ciscointerview1.com;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "sjljfffffffffcehlcsc"; // Input string
        HashSet<Character> set = new HashSet<>(); // Set to store unique characters

        // Loop through each character in the input string
        for (char c : s.toCharArray()) {
        	set.add(c); 
        }

        System.out.println("String after removing duplicates: " + set.toString());
    }
}
