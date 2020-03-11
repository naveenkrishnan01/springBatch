package com.samples;

public class merhodLoading {

    // overlaoding
    //method name is the same and method signature is diffrent.
    //retun may or not be the same


    static int add(int a, int b){
        return a + b;
    }

    static int add (int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(4,5));
        System.out.println(add(9,10, 1));
    }


}
