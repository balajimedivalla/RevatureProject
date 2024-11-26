package Projects;

public class RepalceChar {
    public static void main(String[] args) {
        String b = "balaji";
        char z = 'b';
        char f= 'a';

        String A="";

   
        for (int i = 0; i <b.length(); i++)
        {
            char c = b.charAt(i);
            if (c == z )
            {
                A=A+ f;
            } 
            else
            {
                A =A+ c;
            }
        }
        System.out.println(A);
}}
