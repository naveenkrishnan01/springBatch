package com.samples;

public class TotalNoOfCharInString {

    static void CountCharInString(String input){
        int c = 0;
        String replace_input = input.replaceAll("\\s", "");
        int len = replace_input.length();

        for (int i=0; i <= len-1; ++i){
            c = replace_input.charAt(i);
            c = i+1;
        }
        System.out.println("The number of char in a string  " + c);

    }

    public static void main(String[] args) {
        CountCharInString("Naveen Krishnan");
    }
}
