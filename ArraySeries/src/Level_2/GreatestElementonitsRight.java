package Level_2;

import java.util.Scanner;

/**
 * Replace every element with the greatest element on its right
 */

public class GreatestElementonitsRight {

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
    private static void findGreatestElementonitsRight(int[] arr, int size) {
        validateArray(arr);
        int current = 0;
        int temp = 0;

        temp = arr[size - 1];
        arr[size - 1] = -1;

        for(int i = size - 2; i >= 0; i--){
            current = arr[i];
            arr[i] = temp;
            temp = Math.max(temp, current);
        }

        for(int i : arr){
            System.out.print(i + " ");
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


        findGreatestElementonitsRight(arr,size);

    }
}
