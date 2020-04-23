package com.samples;

public class vowelCount {

    static void countVowel(String s){

        int length_string = s.length();

        char [] c = s.toCharArray();
        int vowel_count = 0;

        for (int i=0; i< length_string-1; i++){
            char t = s.charAt(i);
            if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ){
               vowel_count ++;
            }
        }
        System.out.println("The number of count of vowels  " + vowel_count);

    }

    public static void main(String[] args) {
        String st = "Alive is well";
        countVowel(st);

    }

}
