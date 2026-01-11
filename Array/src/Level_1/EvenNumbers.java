package Level_1;

import java.util.Scanner;

/**
 * Count how many even numbers are present
 */

public class EvenNumbers {

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
    private static int findEvenNumber(int[] arr, int size) {
        validateArray(arr);
        int evenCount = 0;
        for(int num : arr){
            if(num % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;

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

        int result = findEvenNumber(arr,size);
        System.out.println("Even numbers in the array are: "+ result);
    }
}
