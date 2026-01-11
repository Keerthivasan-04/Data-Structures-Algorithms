package Basics;

import java.util.Scanner;

public class ReverseArray {

    private static void reverse(int[] arr, int size) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reverse Array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
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
        reverse(arr,size);
    }
}
