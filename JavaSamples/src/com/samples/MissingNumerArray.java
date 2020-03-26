package com.samples;

public class MissingNumerArray {

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,11};

        int n = 11;  // largest number in the array
        int sum = (n * (n+1))/2;
        int total_sum = calc_numbers(numbers);

        int missing_num = sum - total_sum;
        System.out.println(missing_num);

    }

    private static int calc_numbers(int[] numbers) {
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }

}
