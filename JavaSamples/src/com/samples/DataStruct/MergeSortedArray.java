package com.samples.DataStruct;

public class MergeSortedArray {


    //int [] arr1 = {2,3,5,7,9};
    //int [] arr2 = {2,4,5,6,9};
    //int [] merged_arr = {2,2,3,4,5,5,6,7,9,9};

    public void mergedArray(int [] arr1, int [] arr2,  int n, int k, int merged_arr[]){

        int i =0; int j =0; int l =0;

        // traverse array
        //while element in arr1 is greater than arr2
        while (i < n && j < k){
            if (arr1[i] < arr2[j]){
                merged_arr[l++] = arr1[i++];
            } else{
                merged_arr[l++] = arr2[j++];
            }



        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,9};
        int n1 = arr1.length;

        int [] arr2 = {2,4,5,6,9};
        int n2 = arr2.length;

        int [] merged_arr = new int[n1 + n2];

        MergeSortedArray t = new MergeSortedArray();
        t.mergedArray(arr1,arr2,n1, n2, merged_arr);

        System.out.println("Array after merging");

        for (int i =0; i<n1+n2; i++){
            System.out.println(merged_arr[i]);

        }
    }
}
