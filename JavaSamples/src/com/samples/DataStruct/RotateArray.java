package com.samples.DataStruct;

public class RotateArray {

    static void rotateLeft(int [] arr){
         int [] arr1 =  {2,4,6,7,9};
         int n = 2;

         for (int i =0; i<n; i++){
          int first;
          int j;
          first = arr1[i];  //store the first element

          for (j=0; j<arr1.length-1; j++){
              arr[j] = arr[j+1]; // shift element by 1 to the right
          }
            arr[j]= first;  // store the element in the end
         }

    }

    public static void main(String[] args) {
        int [] arr1 =  {2,4,6,7,9};
              rotateLeft(arr1);
        for (int i =0; i <=arr1.length-1; i++){
            System.out.println(arr1[i]);
        }
    }

    }

