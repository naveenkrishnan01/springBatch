package com.samples;

public class Palindrome {

    //malayalam
    public  String reverse = " ";

    public void palindrme(String text) {

         String text_lowercase = text.replaceAll("\\s", "").toLowerCase();
         int length = text_lowercase.length();
         int forward = 0;
         int backward = length - 1;

         while (backward > forward){
             char forward_char = text_lowercase.charAt(forward++);
             char backward_char = text_lowercase.charAt(backward--);

             if (forward_char == backward_char){
                  System.out.println("This text is a palindrome" + text);
             } else {
                 System.out.println("This text is not a palindrome" + text);
             }
         }


    }

    public static void main(String[] args) {
          Palindrome check = new Palindrome();
          check.palindrme("malayalam");
    }
}
