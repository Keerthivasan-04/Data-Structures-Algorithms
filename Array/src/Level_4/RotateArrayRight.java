package Level_4;

import java.util.Scanner;

/**
 * Rotate array right by 1 position
 * Rotate array right by k position
 */

public class RotateArrayRight {

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

    private static void rightrotateby1(int[] arr, int size) {
        validateArray(arr);
        int temp = arr[size - 1];
        for(int i = size - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println("Right Rotate by 1: ");
        displayArray(arr);
    }

    private static void rightrotatebyk(int[] arr, int size, int k) {
        validateArray(arr);

        if (k == 0) {
            System.out.println("Right Rotate by 0: ");
            displayArray(arr);
            return;
        }

        k = k % size;

        reverse(arr, 0, size - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, size - 1);

        System.out.println("Right Rotate by " + k + " : ");
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

        rightrotateby1(arr1, size);
        System.out.println();

        System.out.println("How many times to rotate the array?");
        int k = sc.nextInt();
        rightrotatebyk(arr2, size, k);
    }
}
