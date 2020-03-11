package com.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.System.*;

public class RemoveArrayDuplicates {

    public static void main(String[] args) {

      int [] numbers = {1,2,3,4,3,6,7,8,9,6};

      for (int i=0; i <= numbers.length-1; i++){
          for (int j = i+1; j < numbers.length; j++ ){

              if (numbers[i] == numbers[j] && (i!=j)){
                  System.out.println("Duplicate numbers  " + numbers[j]);
              }

          }
      }


    }




}
