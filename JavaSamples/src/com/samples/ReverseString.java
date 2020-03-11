package com.samples;

public class ReverseString {

    public static void main(String[] args) {

        String my_reverse = "Naveen";

        char []c = my_reverse.toCharArray();

        for (int i = c.length-1; i>=0; i--){
            System.out.println(c[i]);
        }
    }
}
