package com.samples.DataStruct;

public class GenericExample<T> {

    private T t;

    public GenericExample(){

    }

    public GenericExample(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GenericExample{" +
                "t=" + t +
                '}';
    }

    public static void main(String[] args) {

        GenericExample<String> type = new GenericExample<>();
             type.setT("Naveen");

             System.out.println(type.toString());

        GenericExample type1 = new GenericExample();
        type1.setT("John");
        type1.setT(200);
        type1.setT(500.00);
        type1.setT(-1);

        for(int i =0; i<3; i++){
            System.out.println(type1);
        }
    }
}
