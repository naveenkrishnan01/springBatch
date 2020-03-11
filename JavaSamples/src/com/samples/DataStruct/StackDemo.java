package com.samples.DataStruct;

import java.util.*;

public class StackDemo {

   // LIFO - Last in first out - stack
    public static void main(String[] args) {
        Stack<String> obj = new Stack<String>();

        obj.add("test");
        obj.add("automation");
        obj.add("for");
        obj.add("dummies");

        System.out.println(obj);
        System.out.println("popping out " + obj.pop());
        System.out.println(obj);
        System.out.println("pushing in  " + obj.push("dummies"));
        System.out.println(obj);

        Stack <Integer> obj1 = new Stack<Integer>();
        obj1.add(10);
        obj1.add(20);
        obj1.add(5);
        obj1.add(25);

        System.out.println(obj1);

    }


}
