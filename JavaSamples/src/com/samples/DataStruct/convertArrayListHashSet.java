package com.samples.DataStruct;

import java.util.*;

public class convertArrayListHashSet {

    static void convArrayList(){

        List<String> add_List = new ArrayList<String>();
        add_List.add("Banana");
        add_List.add("Apple");
        add_List.add("Zucchini");
        add_List.add("Apple");


        System.out.println("Add items in arraylist "  + add_List);

        // Hash Set does not allow any duplicates
        Set<String>conv_List = new HashSet<>(add_List);
        System.out.println("Convert to HashSet from ArrayList " + conv_List);


    }

    public static void main(String[] args) {
        convArrayList();
    }
}
