package Level_5;

import java.util.Scanner;

public class MaximumConsecutive1s {

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
    private static int findMaximumConsecutive1s(int[] arr, int size) {
        validateArray(arr);

        int maxCount = 0;
        int count = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");

        int size = sc.nextInt();
        validateInputSize(size);

        int[] arr = new int[size];
        System.out.println("Enter the array elements: (Only Binary Array)");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int result = findMaximumConsecutive1s(arr,size);
        System.out.println("Maximum Consecutive 1s: "+ result);
    }
}
