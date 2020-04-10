package com.samples.DataStruct;

import java.util.HashSet;

public class UniqueCharInString {


    public static void main(String[] args) {

        boolean result=false;
        String input = "AliveAa";

        HashSet<Character> test = new HashSet<>();
        for (int i = 0; i<input.length(); i++) {

            result = test.add(input.charAt(i));
            if (result == false) {
                break;
            }
            System.out.println(result);
        }
    }
}