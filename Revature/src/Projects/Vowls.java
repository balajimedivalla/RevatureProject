package Projects;

public class Vowls {
	    public static void main(String[] args) {
	        String b = "Balaji";
	        String temp = ""; // Convert the string to a character array
	        char[] ch = b.toCharArray();

	        // Loop through the characters
	        for (char c : ch) {
	            // Check if the character is a vowel
	            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' ||
	                c == 'I' || c == 'i' || c == 'O' || c == 'o' ||
	                c == 'U' || c == 'u')
	            {
	               
	                temp += c;
	            }
	        }
	        System.out.println("Vowels: " +" "+ temp+" ");
	    }
	}
