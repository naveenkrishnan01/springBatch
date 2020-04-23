package com.samples.DataStruct;

import java.util.*;

public class DifferentLoops {

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(33);
        test.add(10);
        test.add(45);
        test.add(2);

        // for loop
        System.out.println("Example for Basic loop");
        for (int i=0; i < test.size(); i++){
            System.out.println(test.get(i));
        }

        System.out.println("Example for advanced loop");
        for (int x : test) {
            System.out.println(x);
        }

        System.out.println("Example using while loop");
        int count = 0;
        while(test.size() > count){
            System.out.println(test.get(count));
            count++;
        }

        System.out.println("Example for iterator");
        Iterator y = test.iterator();
                while(y.hasNext()){
                    System.out.println(y.next());
                }

        System.out.println("Collection Stream Example");
                test.forEach((num) -> {
                    System.out.println(num);
                });

    }
}
