package com.samples;

public class ArraySum {

    static boolean arraySums(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] == 0 || sum == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] k = {1,5,1,-7, 1, 6};
        if (arraySums(k)) {
            System.out.println("Found element with 0 sum");
        } else {
            System.out.println("Did not find element with 0 sum");
        }

    }

}