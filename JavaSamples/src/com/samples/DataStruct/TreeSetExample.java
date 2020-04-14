package com.samples.DataStruct;

import java.util.TreeSet;

/*
   TreeSet is an intereaface of set and implements
   ascendign order
   cannot have null values
   does not allow duplicates

   Output : [A, B, C, M, X, Y]
 */

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> st = new TreeSet<>();

        st.add("X");
        st.add("C");
        st.add("B");
        st.add("A");
        st.add("B");
        st.add("Y");
        st.add("M");


        System.out.println(st);
    }


}
