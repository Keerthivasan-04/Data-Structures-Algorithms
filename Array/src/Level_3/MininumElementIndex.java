package Level_3;

import java.util.Scanner;

/**
 * Find the index of the minimum element
 */

public class MininumElementIndex {

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
    private static int findMinimumIndex(int[] arr, int size) {
        validateArray(arr);

        int small = Integer.MAX_VALUE;

        int minIndex = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] < small){
                small = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
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

        int result = findMinimumIndex(arr,size);
        System.out.println("Minimum element's index is : " + result);
    }
}
