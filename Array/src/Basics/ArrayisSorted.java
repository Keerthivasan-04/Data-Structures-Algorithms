package Basics;

import java.util.Scanner;

public class ArrayisSorted {

    // Method to check if array is sorted in ascending order
    private static boolean isSorted(int[] array) {

        // An empty array or single element array is considered sorted
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        if (isSorted(array)) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted in ascending order");
        }
    }

}