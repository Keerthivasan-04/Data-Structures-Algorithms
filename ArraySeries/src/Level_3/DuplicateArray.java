package Level_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Check if array contains duplicates
 */

public class DuplicateArray {

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
    private static boolean isDuplicate(int[] arr, int size) {
        validateArray(arr);

        if(size == 1)   return false;

        Arrays.sort(arr);
        for(int i = 0; i < size-1; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
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
        if(isDuplicate(arr,size)){
            System.out.println("The given array contains duplicate elements");
        }
        else{
            System.out.println("The given array contains unique elements");
        }
    }
}
