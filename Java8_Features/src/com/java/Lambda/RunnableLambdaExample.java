package com.java.Lambda;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method starts.. ");
    }
}

public class RunnableLambdaExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        // Method 1
        Runnable runnable = () -> System.out.println("run method starts via runnable method 1...");

        Thread threadLambda = new Thread(runnable);
        threadLambda.start();

        // Method 2
        Thread threadLambda1 = new Thread( () -> System.out.println("run method starts via runnable method 2...") );
        threadLambda1.start();

    }
}
