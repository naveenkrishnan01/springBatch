package com.samples.DataStruct;

import java.util.*;

public class LoopArrayList {

     public static int Company_Size;

    static ArrayList<String> loopArrayList() {

        ArrayList<String> companies = new ArrayList<>();
        companies.add("Google");
        companies.add("FaceBook");
        companies.add("Amazon");
        companies.add("Microsoft");

         Company_Size = companies.size();
        System.out.println(Company_Size);
          return companies;

    }

    public static void main(String[] args) {

        ArrayList<String> comp = loopArrayList();

        for (int i=0; i<=Company_Size; i++){
            System.out.println(comp.get(i));
        }

        for (String temp:  comp){
            System.out.println(temp);
        }

    }
    }

