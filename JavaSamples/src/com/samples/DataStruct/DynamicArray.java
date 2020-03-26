package com.samples.DataStruct;

import java.util.*;

public class DynamicArray {

    public static void main(String[] args) {

        // ArrayList is a dynamic array
        // It has size and capacity
        // size cauld be for 4 indexes and capacity is the size which could be 10
        // if capacity gets filled up it will allocate more capacity which can be double

        List<Integer> test = new ArrayList<>();
        test.add(15);
        test.add(20);
        test.add(30);

        System.out.println(test);
    }

}
