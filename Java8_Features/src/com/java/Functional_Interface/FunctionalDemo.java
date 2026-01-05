package com.java.Functional_Interface;

import java.util.function.Function;

// Traditional Method
class FunctionalImpl implements Function<String, Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionalDemo {
    public static void main(String[] args) {

        // Traditional way
        Function<String, Integer> functional = new FunctionalImpl();
        System.out.println(functional.apply("Keerthivasan"));

        // Lambda way -> There is np need to create a class and implement Function<T,R>
        Function<String, Integer> functional1 = (String s) -> s.length();
        System.out.println(functional1.apply("Keerthivasan"));
    }
}
