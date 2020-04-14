package com.samples.DataStruct;

import java.util.HashSet;
import java.util.Set;

/*
   HashSet does not allow duplicates
   It is not thread safe
   It allows atlest one null value
 */

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("cat");
        hashSet.add("dog");
        hashSet.add(null);
        hashSet.add("cat");
        hashSet.add(null);
        hashSet.add("mouse");
        hashSet.add(null);



        System.out.println(hashSet);
    }

}
