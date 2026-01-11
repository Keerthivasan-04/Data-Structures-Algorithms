package Level_1;

import java.util.Scanner;

/**
 * Find the smallest element in an array
 */

public class SmallestNumber {

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
    private static int findSmall(int[] arr, int size) {
        validateArray(arr);
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        return small;
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

        int result = findSmall(arr,size);
        System.out.println("Smallest number in the array: "+ result);
    }
}
