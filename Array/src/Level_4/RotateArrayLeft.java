package Level_4;

import java.util.Scanner;

/**
 * Rotate array left by 1 position
 * Rotate array left by k position
 */

public class RotateArrayLeft {
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
    private static void displayArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void reverse (int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void leftrotateby1(int[] arr, int size) {
        validateArray(arr);
        int temp = arr[0];
        for(int i = 0; i < size - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[size - 1] = temp;
        System.out.println("Left Rotate by 1: ");
        displayArray(arr);
    }

    private static void leftrotatebyk(int[] arr, int size, int k) {
        validateArray(arr);

        if (k == 0) {
            System.out.println("Left Rotate by 0: ");
            displayArray(arr);
            return;
        }

        k = k % size;

        reverse(arr, 0,  k-1);
        reverse(arr, k, size-1);
        reverse(arr, 0, size-1);
        System.out.println("Left Rotate by " + k + " : ");
        displayArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");

        int size = sc.nextInt();
        validateInputSize(size);

        int[] original = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < size; i++){
            original[i] = sc.nextInt();
        }

        int[] arr1 = original.clone();  // copy for rotate by 1
        int[] arr2 = original.clone();  // copy for rotate by k

        leftrotateby1(arr1, size);
        System.out.println();

        System.out.println("How many times to rotate the array?");
        int k = sc.nextInt();
        leftrotatebyk(arr2, size, k);
    }
}
