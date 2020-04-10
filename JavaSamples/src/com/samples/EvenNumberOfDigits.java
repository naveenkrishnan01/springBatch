package com.samples;

public class EvenNumberOfDigits {


    public void evenNumberOfDgt(int [] num){



        int count =0;
        for (int i=0; i<=num.length-1; i++ ){
            int num1 = num[i];

            String t = Integer.toString(num1);
            int x = t.length();
            if (x%2 == 0){
                System.out.println("This is even Number of Digit  " + num[i]);
            }
        }

    }

    public static void main(String[] args) {
        EvenNumberOfDigits verify = new EvenNumberOfDigits();
        int [] k = {28383, 838, 73, 9394, 13};
        verify.evenNumberOfDgt(k);

    }
}
