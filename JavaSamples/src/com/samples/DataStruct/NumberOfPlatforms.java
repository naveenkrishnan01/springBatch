package com.samples.DataStruct;

public class NumberOfPlatforms {

    public static void main(String[] args) {

        int[] arr = {100, 140, 250, 200, 440, 410, 600};
        int[] dep = {700, 330, 150, 430, 120};

        // sort the arr and dep time for these arrays
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
            System.out.println("Sort arrival " + arr[i]);
        }
        for (int i = 0; i < dep.length; i++) {
            for (int j = i + 1; j < dep.length; j++) {
                if (dep[i] > dep[j]) {
                    temp = dep[j];
                    dep[j] = dep[i];
                    dep[i] = temp;

                }
            }
            System.out.println("Sort depature"  + dep[i]);
        }
    }
}



