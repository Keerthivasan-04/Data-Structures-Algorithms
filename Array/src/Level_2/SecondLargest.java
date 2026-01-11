package Level_2;

import java.util.Scanner;

/**
 * Find the second - largest element (without sorting)
 * Conditions:
 *    1. If the array contains only one or no elements, return -1.
 *    2. If all elements are the same, return that element.
 *    3. If the array has duplicates but a valid distinct second largest exists, return the second largest.
 *       {5, 5, 4}
 */

public class SecondLargest {

    // --- Validation methods ---
    private static void validateInputSize(int size) {
        if(size < 0){
            throw new IllegalArgumentException("Array size must be positive");
        }
        if(size == 0){
            throw new IllegalArgumentException("Array size must be greater than zero");
        }
    }

    // --- Business Methods ---
    private static int findSecondLargestElement(int[] arr, int size) {

        if(size == 0 || size == 1)  return -1;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            }
            else if(num > secondMax && num != max) {
                secondMax = num;
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            return max;
        }
        return secondMax;
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

        int result = findSecondLargestElement(arr,size);
        System.out.println("Second Largest element in the array: " + result);
    }
}
