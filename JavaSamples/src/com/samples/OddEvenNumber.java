package com.samples;

public class OddEvenNumber {

    public void oddEven() {

        int [] num = {1,2,3,4,5};
        int num_length = num.length;

        for (int i = num_length; i>=2; i--){
            if (i % 2 == 0){
                System.out.println("The number is even " + i);
            }else  {
                System.out.println("The number is odd " + i);
            }

            if (i % 2 == 0){
                int j = i -1;
                System.out.println("The number is " + j);
            }
        }
    }

    public static void main(String[] args){
        OddEvenNumber x = new OddEvenNumber();
        x.oddEven();
    }

}
