package Level_4;

import java.util.Scanner;

/**
 * Shift all negative numbers to the left
 */

public class NegativetoLeft {

    // --- Validation methods ---
    private static void validateInputSize(int size) {
        if(size < 0){
            throw new IllegalArgumentException("Array size must be positive");
        }
        if(size == 0){
            throw new IllegalArgumentException("Array size must be greater than zero");
        }
    }

    private static void validateArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
    }

    // --- Business Methods ---
    private static void moveZerostoLeft(int[] arr, int size) {
        validateArray(arr);
        int left = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");

        int size = sc.nextInt();
        validateInputSize(size);

        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        moveZerostoLeft(arr,size);
    }
}
