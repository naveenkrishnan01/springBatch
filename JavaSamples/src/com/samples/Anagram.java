package com.samples;
import java.util.*;

public class Anagram {

    public static String message;

    static void check_anagram(String st1, String st2) {


        //  List<String> t1 = new ArrayList<String>();
        //  List<String> t2 = new ArrayList<String>();

        st1.replaceAll("\\s", "").toLowerCase();
        st2.replaceAll("\\s", "").toLowerCase();
        char[] l = st1.toCharArray();
        char[] m = st2.toCharArray();
        Arrays.sort(l);
        Arrays.sort(m);
        loop1:
        if (l.length != m.length) {
            System.out.println(l);
            System.out.println(m);
            System.out.println("Not a Anagram because of mismatch length");
            break loop1;

        }  else if (Arrays.equals(l,m))
           {
             System.out.println(l);
             System.out.println(m);
             System.out.println("The String is Anagram");

         } else {
              System.out.println(l);
              System.out.println(m);
              System.out.println("The String is NOT Anagram");
          }


    }

    public static void main(String[] args) {
           check_anagram("stores", "toress");

    }
}
