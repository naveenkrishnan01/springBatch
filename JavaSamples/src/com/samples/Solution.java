package com.samples;

class Solution {
    public void solution(int N) {

        if (N % 2 == 0 && N % 3 == 0) {
            System.out.println("Codility Test");
        } else if (N % 2 == 0 && N % 3 == 0 && N % 5 == 0) {
            System.out.println("Codility Test Coders");

        }

        }

    public static void main(String[] args) {
        Solution t = new Solution();
        t.solution(24);
    }

    }




    // write your code in Java SE 8
