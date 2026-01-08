package Level_5;

import java.util.Scanner;

/**
 * Find the element that appears only once (others twice)
 */

public class NonRepeatingElement {

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
    private static int findNonRepeatingElement(int[] arr, int size) {
        validateArray(arr);
        int start = 0;

        for(int num : arr){
            start ^= num;
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");

        int size = sc.nextInt();
        validateInputSize(size);

        int[] arr = new int[size];
        System.out.println("Enter the array elements: One element appear one others are twice");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int result = findNonRepeatingElement(arr,size);
        System.out.println("Non Repeating Element is: " + result);
    }
}
