package com.java.Functional_Interface;


@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);

    default void m1(){
        System.out.println("Default Hello");
    }
}
