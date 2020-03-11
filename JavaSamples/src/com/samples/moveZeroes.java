package com.samples;


// move eroes to the right
public class moveZeroes {

    public void moveZeroesToEnd(int[] arr, int n) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];


                while (count < n)
                    arr[count++] = 0;


            }
        }

    }

    public static void main(String[] args) {
        int[] k = {6, 7, 1, 0, 5, 4, 0, 9, 2};
        moveZeroes t = new moveZeroes();
        for (int i = 0; i <= k.length; i++) {
            t.moveZeroesToEnd(k, k.length);
            System.out.println(k[i]);
        }
    }
}
