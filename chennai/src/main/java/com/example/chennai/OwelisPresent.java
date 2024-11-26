package com.example.chennai;

public class OwelisPresent {
    public static void main(String[] args) {
        String s = "Balaji";
        StringBuilder vowelsFound = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' ||
                ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' ||
                ch == 'U' || ch == 'u') {
                vowelsFound.append(ch);
               
            }
        }
        if (vowelsFound.length() > 0) {
            System.out.println("Vowels found: " + vowelsFound);
        } else {
            System.out.println("No vowels found in string");
        }
    }
}
