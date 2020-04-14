package com.samples;

public class ThreadSample implements Runnable {

    public void run(){
        System.out.println("Running an interface with Runnable");
    }

    public static void main(String[] args) {
        ThreadSample t = new ThreadSample();
        Thread impl = new Thread(t);
        impl.run();

    }
}
