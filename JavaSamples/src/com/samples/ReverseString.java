package com.samples;

public class ReverseString {

    public static void main(String[] args) {

        String my_reverse = "Naveen";

        char []c = my_reverse.toCharArray();

        for (int i = c.length-1; i>=0; i--){
            System.out.println(c[i]);
        }

        // 1234%10 = 4
        // reverse_num = 0
        // reverse_numm = 0*10 + 4
        //  123%10 = 3
        //  reverse_num = 3
        // revese_num = 4*10 + 3 = 43
        // reverse_num = 43*10 + 2 = 432
        //

        int my_number = 1234;

          int reverse_num = 0;
           while (my_number !=0){
               int digit = my_number % 10;
               reverse_num = reverse_num * 10 + digit;
               my_number /=10;

           }

        System.out.println(reverse_num);
    }


}
