package Basics;

import java.util.Scanner;

public class SumandAverage {

    private static int sum(int[] arr, int size) {
        int total = 0;
        for(int i = 0; i < size; i++){
            total += arr[i];
        }
        return total;
    }

    private static int average(int[] arr, int size) {
        int total = sum(arr,size);
        int count = 0;
        for(int i = 0; i < size; i++){
            count++;
        }
        return total / count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Element: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum: " + sum(arr,size));
        System.out.println("Average: " + average(arr,size));
    }
}
