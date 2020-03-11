package com.samples;

public class PalindromeClosestNum {


    //odd number palidrome
    // first find the lenght of string and see if it is divisible by 2 , if not it is odd
    //So let us tak 12345.
    // extract the middle number in this case 3 and reverse the remaining towo nmbers after 3
    //  so 12321 is less than 12345. In sucj a case increase the midde number b 1
    // so 12321 will become 12421

    // case 2 : 12945
    // so in this case 9 cannot be incremented further.
    // in this case increment by 1 until 9. so 129 becomes 130
    // then it become 13045.
    // so now 13045 will become 13031 whih is greater than 12945

    // case 3: 234935 - Even number
    // In this case the middle two digits is taken in this case '49'
    // Increment it by 1 which makes it 50
    // Then swap the last two digit at 32
    // 235032  --
}
