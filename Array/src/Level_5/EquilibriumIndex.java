package Level_5;

import java.util.Scanner;

/**
 * Find equilibrium index (brute traversal)
 */

public class EquilibriumIndex {

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
    private static int findEquilibriumIndex(int[] arr, int size) {
        validateArray(arr);
        for(int i = 0; i < size; i++){

            int leftSum = 0;
            int rightSum = 0;

            for(int j = 0; j < i; j++){
                leftSum += arr[j];
            }

            for(int k = i + 1; k < size; k++){
                rightSum += arr[k];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;

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
        int result = findEquilibriumIndex(arr,size);
        System.out.println("Equilibrium Index: "+ result);
    }
}
