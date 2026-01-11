package Level_5;

import java.util.Scanner;

/**
 * Find the missing number from 1 to N
 */

public class MIssingNumber {
    // --- Validation methods ---
    private static void validateInputSize(int size) {
        if(size <= 0){
            throw new IllegalArgumentException("Array size must be greater than zero");
        }
    }

    private static void validateArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
    }

    // --- Business Methods ---
    private static int findMissingNumber(int[] arr, int size) {
        validateArray(arr);
        int expectedTotal = (size * (size + 1)) / 2;
        int currentTotal = 0;

        for(int num : arr){
            currentTotal += num;
        }
        return expectedTotal - currentTotal;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N (the range 1 to N): ");
        int n = sc.nextInt();
        validateInputSize(n);

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMissingNumber(arr,n);
        System.out.println("Missing number is: " + result);
    }
}
