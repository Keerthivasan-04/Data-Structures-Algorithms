package com.java.Lambda;

interface Addable{
    int add(int a,int b);
}

public class LambdaParameters {
    public static void main(String[] args) {

        // Method 1 -> Single line
//        Addable ad = (int a, int b) -> (a+b);
//        int result = ad.add(10,3);
//        System.out.println(result);

        // Method 2 -> Multiple block lambda expression
        Addable abc = (int a, int b) -> {
            int c = (a + b);
            return c;
        };
        int result = abc.add(10,3);
        System.out.println(result);
    }
}


