package com.java.Lambda;

interface Shape{
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {
        // Method 1
        Shape rectangle = () -> System.out.println("Rectangle draw() method works");
        //rectangle.draw();

        Shape circle = () -> System.out.println("Circle draw() method works");
        //circle.draw();

        Shape square = () -> System.out.println("Square draw() method works");
        //square.draw();


        //Method 2 -> Lambda experession pass as a parameter
        print(rectangle);
        print(circle);
        print(square);

        //Method 3 -> Print these in single line
        print(() -> System.out.println("Rectangle draw() method works"));
        print(() -> System.out.println("Circle draw() method works"));
        print(() -> System.out.println("Square draw() method works"));
    }

    private static void print(Shape shape){
        shape.draw();
    }
}
