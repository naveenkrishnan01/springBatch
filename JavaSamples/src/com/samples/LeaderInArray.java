package com.samples;

public class LeaderInArray {

    public static void main(String[] args) {

        int arr[] = {12, 6, 7, 3, 12, 10, 9};

        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
                }
                if (j == size)
                    System.out.println(arr[i] + " ");

            }

        }

    }


