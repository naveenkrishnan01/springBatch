package com.samples.DataStruct;

import java.util.HashMap;

public class NonRepeatedString {


    // letter  - case 1
    // Here r is thenon-repeated string
    //  tetter -- case 1
    //Here r is he nonrepeated string


    static Character Nonrepeating(String s){
        int k = s.length();

        Character c;
        HashMap<Character, Integer> findString = new HashMap<Character, Integer>();

        for(int i=0; i<k; i++){

          c= s.charAt(i);
          if(findString.containsKey(c)){
              findString.put(c, findString.get(c) + 1);
              System.out.println(findString);
          }else {
              findString.put(c,1);
          }
        }

        // the hastable is not in sorted order

        for (int i=0; i<k; i++ ){
            c= s.charAt(i);
            if (findString.get(c)== 1){
                return c;
            }

        }
        System.out.println("No nonrepeating string found");
        return null;
    }

    public static void main(String[] args) {

       char c = Nonrepeating("assa");
       System.out.println(c);
    }
}
