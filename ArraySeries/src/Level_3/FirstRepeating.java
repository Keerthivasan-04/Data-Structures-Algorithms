package Level_3;

import java.util.Scanner;

/**
 * Find the first repeating element (without using set)
 */

public class FirstRepeating {

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
    private static int findFirstRepeatingElement(int[] arr, int size) {
        validateArray(arr);
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(arr[i] == arr[j]){
                    minIndex = Math.min(minIndex,i);
                }
            }
        }
        return (minIndex == Integer.MAX_VALUE) ? -1 : arr[minIndex];
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
        int result = findFirstRepeatingElement(arr,size);
        System.out.println("First repeating element is: "+result);
    }
}
