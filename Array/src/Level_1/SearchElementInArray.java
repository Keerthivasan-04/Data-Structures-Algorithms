package Level_1;

import java.util.Scanner;

/**
 * Check whether a given number exists in the array
 */

public class SearchElementInArray {

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
    private static boolean isElementExists(int[] arr, int target) {
        validateArray(arr);
        for(int num : arr){
            if(num == target){
                return true;
            }
        }
        return false;
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

        System.out.println("Enter the element to be search: ");
        int target = sc.nextInt();

        if(isElementExists(arr,target)){
            System.out.println("The element is present in the array");
        }
        else{
            System.out.println("The element is not present in the array");
        }
    }
}
