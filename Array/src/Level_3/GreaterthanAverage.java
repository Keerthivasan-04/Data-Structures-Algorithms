package Level_3;

import java.util.Scanner;

/**
 * Count how many elements are greater than the average
 */

public class GreaterthanAverage {

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
    private static int findAverage(int[] arr, int size) {
        int sum = 0;

        for(int i : arr){
            sum += i;
        }
        return sum /size;
    }

    private static int findGreaterthanAverage(int[] arr, int size) {
        validateArray(arr);
        int average = findAverage(arr,size);
        int count = 0;
        for(int num : arr){
            if(num > average){
                count++;
            }
        }
        return count;
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

        int result = findGreaterthanAverage(arr,size);
        System.out.println("Count: " + result);
    }
}
