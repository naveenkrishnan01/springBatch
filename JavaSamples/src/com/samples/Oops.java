package com.samples;

public class Oops {

    public void displayname(String text){
        System.out.println(text);
    }

    public String returnName(String name) {
        return name;
    }

    public boolean nameExist(String sometext) {
        if (sometext == null) {
            return false;
        } else {
            return true;
        }
    }
      public int addTwoNmubers(int a, int b) {
            int result = a + b;
            return result;
        }

        public void aTOzchar(){
              char c;
          for (c='A'; c<='Z'; c++){
              System.out.println(c);
            }
        }

        public float multiplyFloat(float x, float y){
            float result_float = x * y;
            return result_float;
        }

        public void swapTwoCharacters(char m, char n){
             char temp;
             //AB  should be BA
            temp = m; // temp holds A
            m = n;  // m holds B
            n = temp;  // n hold A
            System.out.println("  char1 :" + m + "   chanr2 :" +  n);

        }

        public String leapyear(int year1){
            String result;
            if (year1 % 4 == 0){
                result = "Leap Year";
            } else
                result = "Not Leap Year";

           return result;
        }



    public static void main(String[] args) {
        Oops test = new Oops();
        test.displayname("Naveen");
        System.out.println(test.returnName("Krishnan"));
        System.out.println(test.nameExist("x"));
        System.out.println(test.addTwoNmubers(3, 2));
        test.aTOzchar();
        System.out.println(test.multiplyFloat(5.0f, 3.0f));
        test.swapTwoCharacters('a','b');
        System.out.println(test.leapyear(2012));
    }
}
