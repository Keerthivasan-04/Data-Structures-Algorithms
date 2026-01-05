package Level_2;

import java.util.Scanner;

/**
 * Check if the array is strictly increasing
 */

public class StrictlyIncreasingArray {

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
    private static boolean isStrictlyIncreasing(int[] arr, int size) {
        validateArray(arr);
        if(size == 1)   return true;

        for(int i = 1; i < size; i++){
            if(arr[i] <= arr[i-1]){
                return false;
            }
        }
        return true;
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
        if(isStrictlyIncreasing(arr,size)){
            System.out.println("Array is strictly increasing");
        }
        else{
            System.out.println("Array is not strictly increasing");
        }
    }


}
