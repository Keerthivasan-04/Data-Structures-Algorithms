package Level_4;

import java.util.Scanner;

/**
 * Check if array is sorted and rotated
 */

public class CheckArrayisSortedandRotated {
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
    private static boolean checkArrayisSortedandRotated(int[] arr, int size) {
        validateArray(arr);
        int breaks = 0;
        for(int i = 0; i < size-1; i++){
            if(arr[i] > arr[i + 1]){
                breaks++;
            }
            if(arr[size - 1] > arr[0]){
                breaks++;
            }
        }
        return breaks == 1;
        
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
        ;
        if(checkArrayisSortedandRotated(arr,size)){
            System.out.println("It is sorted and rotated");
        }
        else{
            System.out.println("It is not sorted and rotated");
        }
    }
}
