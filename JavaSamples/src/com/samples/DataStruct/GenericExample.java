package com.samples.DataStruct;



public class GenericExample {


    @FunctionalInterface
    public interface AnyArguments<Y> {
        Y process(Y arg1, Y arg2);
    }


    // Implementing the AnyArguments interface which can take any type.
    public static void main(String[] args) {
      /*  // Example 1
            AnyArguments<Integer> AddInt = new AnyArguments<Integer>() {

                // In this case it takes the Integer type
                @Override
                public Integer process(Integer arg1, Integer arg2) {
                    return arg1 + arg2;
                }
            };
            System.out.println(AddInt.process(2,5));
            //output would be 7

*/
        //Example 2


        AnyArguments<String> AddWords = new AnyArguments<String>() {

            // In this case it can take the String type
            @Override
            public String process(String arg1, String arg2) {
                return arg1 + " " + arg2;
            }
        };

        System.out.println(AddWords.process("Naveen", "Krishnan"));

    }

}