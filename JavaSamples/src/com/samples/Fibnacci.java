package com.samples;

public class Fibnacci {

    public static int n = 10;
    public static int t1 = 1;
    public static int t2 = 2;


    public static void main(String[] args) {
         System.out.println(t1);
         System.out.println(t2);
        for (int i=2; i<= n; i++ ){
            int j = t1 + t2;
                t1 = t2;
                t2 = j;

           System.out.println(t2);

        }

    }
}
