package com.example.chennai;

import java.util.HashSet;

public class FoundDuplicatesString {
    static public void main(String[] args) {
        String s = "Balaji";
        HashSet<Character> charSet = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charSet.contains(ch)) {
   
                duplicates.add(ch);
            } else {
             
                charSet.add(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
           
            if (!duplicates.contains(ch)) {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
