package com.samples;

/*
Returning multiple values in method
 */

public class RetrnMutipleVal {

    final static class Person {

        String fname;
        String lname;
        String gender;


         public Person(String fname, String lname, String gender) {
            this.fname = fname;
            this.lname = lname;
            this.gender = gender;
        }


    }

     public static Person getDetails(){
           String fname = "Naveen";
           String lname = "Kris";
           String gender = "Male";

           return new Person(fname, lname, gender);
     }

    public static void main(String[] args) {

        Person person = getDetails();
        System.out.println(person.fname);
        System.out.println(person.lname);
        System.out.println(person.gender);
    }

}
