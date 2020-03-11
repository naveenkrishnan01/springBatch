package com.samples;

public class SecondLargestinArray {

    public int secondLargest(int [] arr, int size){

        // sort
        for (int i =0; i <size; i++){
            for (int j = i +i; j<size; j++){
               if (arr[i] > arr[j]){
                   //swap element
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }

            }
        }
         return arr[size-2];
    }

    public static void main(String[] args) {
        int [] a = {4,3,6,2,7};
        int[] b = {20, 10, 25, 37, 80};
        SecondLargestinArray t = new SecondLargestinArray();
        System.out.println(t.secondLargest(a, 5));
        System.out.println(t.secondLargest(b, 5));

    }
}
