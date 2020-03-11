package com.samples;
import java.util.Arrays;

public class MultiDimensionalArray {

        public static void main(String[] args) {
            // 1d array
            int [] oneDarray = {0, 3};   // one row with two elements
            System.out.println(Arrays.toString(oneDarray));

            // 2d array
            int [] [] twoDarray = new int [2][4]; // 2 rows and 4 columns
            System.out.println(Arrays.toString(twoDarray).toString());

            int [] twoDarr[] = new int [][] {
                    {3,4}, {5,6}};    // two rows two columns initialized
            System.out.println(twoDarr[0][0]);
            System.out.println(twoDarr[0][1]);
            System.out.println(twoDarr[1][0]);
            System.out.println(twoDarr[1][1]);
            //	System.out.println(twoDarr[1][2]);  - will give an ArrayIndexOutofBound error
        }

        // 3d array
        //pages (plane), rows, columns
        int [][][] threeDArray = new int[3][3][3];

        int [] threeDarray [][] = {
                {{1,2,3}, {4,5,6},{7,8,9}}, // page 1 , 3 rows 3 columns
                {{10,11,12}, {13,14,15}},  // page 2, 2rows , 3 columns
                {{19, 20,21}},       // page 3, 1row , 3 columns
        };
    }


