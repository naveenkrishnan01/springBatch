package com.samples;

public class RotateString {

    //left rotate with t = 2
    // Input : America , left rotate = 2
    // OutPut : ericaAm
    public String leftRotate(String str, int d){
        String ans = str.substring(d) + str.substring(0, d);
        System.out.println("test " + str.substring(d));
      //  System.out.println("test1 " + str.substring(0, d));
        return ans;
    }

    // right rotate with t = 2
    // Input: America
    // Output: caAmeri
    public String rightRotate(String str, int d) {
        String ans;
        return leftRotate(str, str.length()-d);
    }

    public static void main(String[] args) {
        RotateString t = new RotateString();
        String left = t.leftRotate("Geeksforgeeks", 2);
        System.out.println(left);

        String right = t.rightRotate("Geeksforgeeks", 2);
        System.out.println(right);
    }

}
