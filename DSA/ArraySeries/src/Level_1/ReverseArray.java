package Level_1;

import java.util.Scanner;

/**
 * Print the array in reverse order
 */

public class ReverseArray {

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
    private static void reverse(int[] arr, int size) {
        validateArray(arr);
        int left = 0;
        int right = size - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

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
        reverse(arr,size);
        System.out.println("Reversed Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
