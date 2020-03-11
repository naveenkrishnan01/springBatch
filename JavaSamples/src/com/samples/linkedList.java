package com.samples;

import java.util.ArrayList;

public class linkedList {

    public void link(){

        ArrayList<String> obj = new ArrayList<>();
        obj.add("D");
        obj.add("C");
        obj.add("3");

        System.out.println(obj);
    }

    public void passString (int x){


        if ( x == 2) {
            System.out.println("AN");
        }else if (x == 4){
            System.out.println("ANIM");
        }else if (x == 32) {
            System.out.println("ANIMAL");
        }else{
            System.out.println("The correct divisible not passed");
        }

    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.link();
        list.passString(32);
    }

}
