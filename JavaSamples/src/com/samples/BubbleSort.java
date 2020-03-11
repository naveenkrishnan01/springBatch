package com.samples;

public class BubbleSort {

    // k = { 12, 2, 7, 15}
    // k = {2, 12, 7, 15}
    // k = {2, 7, 12, 15}

    public void sortBubble(int[] arr) {

        int n = arr.length;

        for (int i=0; i < n-1; i++){
            for (int j=0; j<n-i-1; j++){

                if (arr[j] > arr[j+1]){  // if 1st element greater than 2nd element
                    // swap the element
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public void printArray(int [] arr) {

        int arr_length = arr.length;
        for (int i=0; i < arr_length; i++ ){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        BubbleSort t = new BubbleSort();
        int [] x = {10, 7, 15, 2, 12};
        t.sortBubble(x);
        t.printArray(x);

    }

}
