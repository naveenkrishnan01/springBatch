package com.samples;

public class SplitString {

    public static void main(String[] args) {

        // split url
        String Url = "https://qa-api.testcom?name=naveen&lname=krishnan&id=2000";

        String [] t = Url.split("['&', '?']");

        for (String x : t){
            System.out.println(x + "\n" + "\n");
        }

     /*   // split string
        String str = "I am going to school";

        String [] j = str.split(" ");

        for  (String m : j){
            System.out.println(m);
        }

        int k_lenght = Url.length();

        char[] hold_url = Url.toCharArray();
        for (int i=0; i<k_lenght; i++){
            System.out.println(hold_url[i]);
        }*/
    }
}
