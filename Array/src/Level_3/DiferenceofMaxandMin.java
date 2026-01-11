package Level_3;

import java.util.Scanner;

/**
 * Find the difference between max and min
 */

public class DiferenceofMaxandMin {

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
    private static int findDifferenceofMaxandMin(int[] arr, int size) {
        validateArray(arr);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : arr){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        return max - min;
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

        int result = findDifferenceofMaxandMin(arr,size);
        System.out.println("Difference of Max and Min is: " + result);
    }
}
