package com.samples;
import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Object> mylist = new ArrayList<Object>(); //The arraylist takes a particulat object
        ArrayList mylist2 = new ArrayList();

        ArrayList<String> list3 = new ArrayList<String>(); // Arraylist of String
        ArrayList<String> list4 = new ArrayList<>() ; // you need not specify type on the RHS
        List<String> list5 = new ArrayList<>();  // use interface type List

        // Add method
        List list8 = new ArrayList();
        //  the above similar to List<Object> = new ArrayList();
        list8.add("dog");
        list8.add(5);
        System.out.println(list8);

        List<String>pets = new ArrayList();
        pets.add("rabbit");
        System.out.println(pets);

        pets.add("dog");
        System.out.println(pets);
        pets.add(0, "cat");
        System.out.println(pets);

        pets.add(1, "monkey");
        pets.add(0, "elephant");
        System.out.println(pets);  // elephant, cat, monkey, rabbit, dog

        // remove
        pets.remove("rabbit");
        System.out.println(pets);  // by object
        pets.remove(1);  // by index
        System.out.println(pets);

        // change
        pets.set(1, "turtle");  // change index 1 element
        System.out.println(pets);

        List<Object> test = new ArrayList();
        test.add("cat");
        test.add(1);
        test.add(15);
        test.add("monkey");
        System.out.println(test);
    }

}
