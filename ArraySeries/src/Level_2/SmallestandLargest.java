package Level_2;

import java.util.Scanner;

/**
 * Find both largest and smallest in one traversal
 */

public class SmallestandLargest {

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
    private static void findMinandMax(int[] arr, int size) {
        validateArray(arr);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : arr){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
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
        findMinandMax(arr,size);
    }
}
