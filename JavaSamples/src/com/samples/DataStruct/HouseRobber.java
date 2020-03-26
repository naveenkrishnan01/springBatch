package com.samples.DataStruct;

public class HouseRobber {

    //Only the alternate house will be stolen.
    // we will assume the odd number houses will be stolen

    public void houseRob() {

        int [] house = {200, 300, 400, 700, 800, 900, 200};
        int k = house.length;
        int even = 0;
        int odd = 0;

        for (int i=0; i<k; i++){
            if (i % 2 == 0){
                even += house[i];
            }else {
                odd += house[i];
                System.out.println(odd);
            }
        }
    }

    public static void main(String[] args) {
        HouseRobber m = new HouseRobber();
        m.houseRob();
    }
}
